package org.miolacnc.dto;

import org.springframework.web.multipart.MultipartFile;

public class DossierCandidatureRequestDto {

	  private String nomEtudiant;
	     private String prenomEtudiant;
	     private String cin;
	     private String email;
	     private float noteS1, noteS2, noteS3, noteS4, noteS5, noteS6;
	     private float noteLicence;
	     private int nombreAnnees;
	     private boolean admis;
	     
	     private MultipartFile semestre1File;
	     private MultipartFile semestre2File;
	     private MultipartFile semestre3File;
	     private MultipartFile semestre4File;
	     private MultipartFile semestre5File;
	     private MultipartFile semestre6File;
	     private MultipartFile preinscriptionFile;
	     private MultipartFile cinFile;
	     private MultipartFile deugFile;
	     private MultipartFile licenceFile;
	     
		public String getNomEtudiant() {
			return nomEtudiant;
		}
		public void setNomEtudiant(String nomEtudiant) {
			this.nomEtudiant = nomEtudiant;
		}
		public String getPrenomEtudiant() {
			return prenomEtudiant;
		}
		public void setPrenomEtudiant(String prenomEtudiant) {
			this.prenomEtudiant = prenomEtudiant;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public MultipartFile getSemestre1File() {
			return semestre1File;
		}
		public void setSemestre1File(MultipartFile semestre1File) {
			this.semestre1File = semestre1File;
		}
		public MultipartFile getSemestre2File() {
			return semestre2File;
		}
		public void setSemestre2File(MultipartFile semestre2File) {
			this.semestre2File = semestre2File;
		}
		public MultipartFile getSemestre3File() {
			return semestre3File;
		}
		public void setSemestre3File(MultipartFile semestre3File) {
			this.semestre3File = semestre3File;
		}
		public MultipartFile getSemestre4File() {
			return semestre4File;
		}
		public void setSemestre4File(MultipartFile semestre4File) {
			this.semestre4File = semestre4File;
		}
		public MultipartFile getSemestre5File() {
			return semestre5File;
		}
		public void setSemestre5File(MultipartFile semestre5File) {
			this.semestre5File = semestre5File;
		}
		public MultipartFile getSemestre6File() {
			return semestre6File;
		}
		public void setSemestre6File(MultipartFile semestre6File) {
			this.semestre6File = semestre6File;
		}
		public MultipartFile getPreinscriptionFile() {
			return preinscriptionFile;
		}
		public void setPreinscriptionFile(MultipartFile preinscriptionFile) {
			this.preinscriptionFile = preinscriptionFile;
		}
		public MultipartFile getCinFile() {
			return cinFile;
		}
		public void setCinFile(MultipartFile cinFile) {
			this.cinFile = cinFile;
		}
		public MultipartFile getDeugFile() {
			return deugFile;
		}
		public void setDeugFile(MultipartFile deugFile) {
			this.deugFile = deugFile;
		}
		public MultipartFile getLicenceFile() {
			return licenceFile;
		}
		public void setLicenceFile(MultipartFile licenceFile) {
			this.licenceFile = licenceFile;
		}
		public boolean isAdmis() {
			return admis;
		}
		public void setAdmis(boolean admis) {
			this.admis = admis;
		}
		public int getNombreAnnees() {
			return nombreAnnees;
		}
		public void setNombreAnnees(int nombreAnnees) {
			this.nombreAnnees = nombreAnnees;
		}
		public float getNoteLicence() {
			return noteLicence;
		}
		public void setNoteLicence(float noteLicence) {
			this.noteLicence = noteLicence;
		}
		public float getNoteS1() {
			return noteS1;
		}
		public void setNoteS1(float noteS1) {
			this.noteS1 = noteS1;
		}
		public float getNoteS2() {
			return noteS2;
		}
		public void setNoteS2(float noteS2) {
			this.noteS2 = noteS2;
		}
		public float getNoteS3() {
			return noteS3;
		}
		public void setNoteS3(float noteS3) {
			this.noteS3 = noteS3;
		}
		public float getNoteS4() {
			return noteS4;
		}
		public void setNoteS4(float noteS4) {
			this.noteS4 = noteS4;
		}
		public float getNoteS5() {
			return noteS5;
		}
		public void setNoteS5(float noteS5) {
			this.noteS5 = noteS5;
		}
		public float getNoteS6() {
			return noteS6;
		}
		public void setNoteS6(float noteS6) {
			this.noteS6 = noteS6;
		}
	     
	     
	     
}
