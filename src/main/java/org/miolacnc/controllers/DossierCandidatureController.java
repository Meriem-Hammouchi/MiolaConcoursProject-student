package org.miolacnc.controllers;

import org.miolacnc.dto.DossierCandidatureRequestDto;
import org.miolacnc.dto.DossierCandidatureResponseDto;
import org.miolacnc.services.DossierCandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	//====================================================================================================
	

	@GetMapping("/download")
	public String etudeDossierCandidature(long studentId, String file) {
		
		String base64String = service.getDossierCondidature(studentId, file);
		return base64String;
	}
	@GetMapping("/datalist")
	public Iterable<DossierCandidatureResponseDto> getListCondidature(){
		return  service.getListCondidature();
		
	}
	
	@GetMapping("/dossierCondidature/{dosCandId}")
	public String getDossierCondidatureStatut(@PathVariable long dosCandId){
		return  service.getDossierCondidatureStatus(dosCandId);
	}
	
	@PutMapping("/valider/{cin}")
	public DossierCandidatureResponseDto ValiderDossierCandidature(@PathVariable String cin) {
		return service.ValiderDossierCandidature(cin);
	}
	
	@PutMapping("/rejeter/{cin}")
	public DossierCandidatureResponseDto RejeterDossierCandidature(@PathVariable String cin) {
		return service.RejeterDossierCandidature(cin);
	}
}
