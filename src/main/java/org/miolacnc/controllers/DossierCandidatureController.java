package org.miolacnc.controllers;

import org.miolacnc.dto.DossierCandidatureRequestDto;
import org.miolacnc.dto.DossierCandidatureResponseDto;
import org.miolacnc.services.DossierCandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DossierCandidatureController {

	@Autowired
	DossierCandidatureService service;
	
	@PostMapping("/upload")
 	public DossierCandidatureResponseDto createDossierCandidature(DossierCandidatureRequestDto request) {
		
		DossierCandidatureResponseDto response = service.createDossierCandidature(request);
		
		return response;
	}
}
