package org.miolacnc.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Optional;

import org.miolacnc.dto.DossierCandidatureRequestDto;
import org.miolacnc.dto.DossierCandidatureResponseDto;
import org.miolacnc.models.DossierCandidatureEntity;
import org.miolacnc.models.StudentFiles;
import org.miolacnc.repository.DossierCandidatureRepository;
import org.miolacnc.repository.StudentFilesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DossierCandidatureService {

	@Autowired
	DossierCandidatureRepository repository;
	
	@Autowired
	StudentFilesRepository studentRepository;
	
	// function calculeNote
		private float calculeNoteAffectee(@RequestBody DossierCandidatureRequestDto requestDto) {
			float note = requestDto.getNoteLicence();
			return note;
		}
	
	// function1 upload
		public DossierCandidatureResponseDto createDossierCandidature(
				@RequestBody DossierCandidatureRequestDto requestDto) {

			DossierCandidatureEntity dossierCondidature = new DossierCandidatureEntity();
			dossierCondidature.setNoteAffectee(calculeNoteAffectee(requestDto));

			BeanUtils.copyProperties(requestDto, dossierCondidature);

			try {
				// creation de dossier candidature de chaque etudiant
				dossierCondidature.setNoteAffectee(dossierCondidature.getNoteLicence());

				StudentFiles files = new StudentFiles();
				files.setCinFile(Base64.getEncoder().encodeToString(requestDto.getCinFile().getBytes()));
				files.setDeugFile(Base64.getEncoder().encodeToString(requestDto.getDeugFile().getBytes()));
				files.setLicenceFile(Base64.getEncoder().encodeToString(requestDto.getLicenceFile().getBytes()));
				files.setPreinscriptionFile(Base64.getEncoder().encodeToString(requestDto.getPreinscriptionFile().getBytes()));
				files.setSemestre1(Base64.getEncoder().encodeToString(requestDto.getSemestre1File().getBytes()));
				files.setSemestre2(Base64.getEncoder().encodeToString(requestDto.getSemestre2File().getBytes()));
				files.setSemestre3(Base64.getEncoder().encodeToString(requestDto.getSemestre3File().getBytes()));
				files.setSemestre4(Base64.getEncoder().encodeToString(requestDto.getSemestre4File().getBytes()));
				files.setSemestre5(Base64.getEncoder().encodeToString(requestDto.getSemestre5File().getBytes()));
				files.setSemestre6(Base64.getEncoder().encodeToString(requestDto.getSemestre6File().getBytes()));
				
				studentRepository.save(files);
				dossierCondidature.setFichiers(files);
				dossierCondidature = repository.save(dossierCondidature);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			DossierCandidatureResponseDto responseDto = new DossierCandidatureResponseDto();
			BeanUtils.copyProperties(dossierCondidature, responseDto);

			return responseDto;
		}
		//===============================================================================================================

		// function2: Download base64
		public String getDossierCondidature(long studentId, String file) {
				// 1- get StudentFiles for this user
				// 2- find which file to return  using chemin
				// 3- return the string
				Optional<StudentFiles> studentFile = studentRepository.findById(studentId);
				
				if(studentFile.isPresent()) {
					switch (file) {
					case "semestre1":
						return studentFile.get().getSemestre1();
					case "semestre2":
						return studentFile.get().getSemestre2();
					case "semestre3":
						return studentFile.get().getSemestre3();
					case "semestre4":
						return studentFile.get().getSemestre4();
					case "semestre5":
						return studentFile.get().getSemestre5();
					case "semestre6":
						return studentFile.get().getSemestre6();
					case "PreinscriptionFile":
						return studentFile.get().getSemestre6();
					case "cinFile":
						return studentFile.get().getSemestre1();
					case "deugFile":
						return studentFile.get().getSemestre1();
					case "licenceFile":
						return studentFile.get().getSemestre1();
					default:
						return " Veuillez saisir un nom valide !";
					}
				}
				else {
					return "Dossier de candidature introuvable";
				}
		}
		
		// fct: Retourn le statut de DC
		public String getDossierCondidatureStatus(long dosCandId) {
			Optional<DossierCandidatureEntity> dosCand = repository.findById(dosCandId);
			if(dosCand.isPresent()) {
				return dosCand.get().getStatut();
			}else {
				return "";
			}
		}

		// function3: Data List
		public Iterable<DossierCandidatureResponseDto> getListCondidature() {

			Iterable<DossierCandidatureEntity> ListEntity = repository.findAll();
			ArrayList<DossierCandidatureResponseDto> responseList = new ArrayList<DossierCandidatureResponseDto>();

			for (DossierCandidatureEntity entity : ListEntity) {
				// create an object of type DossierCandidatureResponseDto
				DossierCandidatureResponseDto responseDto = new DossierCandidatureResponseDto();

				// do copyproperties between the created object and entity
				BeanUtils.copyProperties(entity, responseDto);
				
				responseDto.setStudentId(entity.getFichiers().getStudent_id());
				// add the object to the responseList
				responseList.add(responseDto);
			}
			return responseList;
		}

		public DossierCandidatureResponseDto ValiderDossierCandidature(String cin) {
			DossierCandidatureEntity entity = repository.findByCin(cin);
			if(entity != null) {
				entity.setStatut("Valide");
			}    
			
			DossierCandidatureEntity updatedEntity=repository.save(entity);
			
			DossierCandidatureResponseDto response = new DossierCandidatureResponseDto();
			BeanUtils.copyProperties(updatedEntity, response);

			return response;

		}

		public DossierCandidatureResponseDto RejeterDossierCandidature(@PathVariable String cin) {
			DossierCandidatureEntity entity = repository.findByCin(cin);
			if(entity != null) {
				entity.setStatut("Rejected");
				entity.setNoteAffectee(0);
			}    
			
			DossierCandidatureEntity updatedEntity=repository.save(entity);
			
			DossierCandidatureResponseDto response = new DossierCandidatureResponseDto();
			BeanUtils.copyProperties(updatedEntity, response);

			return response;
		}



}
