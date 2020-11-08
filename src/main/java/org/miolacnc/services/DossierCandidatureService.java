package org.miolacnc.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.miolacnc.dto.DossierCandidatureRequestDto;
import org.miolacnc.dto.DossierCandidatureResponseDto;
import org.miolacnc.models.DossierCandidatureEntity;
import org.miolacnc.models.StudentFiles;
import org.miolacnc.repository.DossierCandidatureRepository;
import org.miolacnc.repository.StudentFilesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


}
