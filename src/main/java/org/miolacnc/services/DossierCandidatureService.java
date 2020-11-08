package org.miolacnc.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.miolacnc.dto.DossierCandidatureRequestDto;
import org.miolacnc.dto.DossierCandidatureResponseDto;
import org.miolacnc.models.DossierCandidatureEntity;
import org.miolacnc.repository.DossierCandidatureRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DossierCandidatureService {

	@Autowired
	DossierCandidatureRepository repository;
	
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
				String path = ".\\dossierscandidatures\\" + dossierCondidature.getCin() + "\\";

				dossierCondidature.setNoteAffectee(dossierCondidature.getNoteLicence());
				dossierCondidature.setPath(path);
				dossierCondidature = repository.save(dossierCondidature);

				Files.createDirectory(Paths.get(path));

				// copier les fichiers pdf dans le dossier de candidature
				Files.copy(requestDto.getSemestre1File().getInputStream(), Paths.get(path + "semestre1.pdf"));
				Files.copy(requestDto.getSemestre2File().getInputStream(), Paths.get(path + "semestre2.pdf"));
				Files.copy(requestDto.getSemestre3File().getInputStream(), Paths.get(path + "semestre3.pdf"));
				Files.copy(requestDto.getSemestre4File().getInputStream(), Paths.get(path + "semestre4.pdf"));
				Files.copy(requestDto.getSemestre5File().getInputStream(), Paths.get(path + "semestre5.pdf"));
				Files.copy(requestDto.getSemestre6File().getInputStream(), Paths.get(path + "semestre6.pdf"));
				Files.copy(requestDto.getPreinscriptionFile().getInputStream(), Paths.get(path + "PreinscriptionFile.pdf"));
				Files.copy(requestDto.getCinFile().getInputStream(), Paths.get(path + "cinFile.pdf"));
				Files.copy(requestDto.getDeugFile().getInputStream(), Paths.get(path + "deugFile.pdf"));
				Files.copy(requestDto.getLicenceFile().getInputStream(), Paths.get(path + "licenceFile.pdf"));

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			DossierCandidatureResponseDto responseDto = new DossierCandidatureResponseDto();
			BeanUtils.copyProperties(dossierCondidature, responseDto);

			return responseDto;
		}


}
