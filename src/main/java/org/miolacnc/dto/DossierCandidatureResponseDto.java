package org.miolacnc.dto;

public class DossierCandidatureResponseDto {

	private long id;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String cin;
    private String email;
    private float noteS1, noteS2, noteS3, noteS4, noteS5, noteS6;
    private float noteLicence;
    private int nombreAnnees;
    private boolean admis;
    private float noteAffectee;
    private String statut;
    private long studentId;
    
    
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	public boolean isAdmis() {
		return admis;
	}
	public void setAdmis(boolean admis) {
		this.admis = admis;
	}
	public float getNoteLicence() {
		return noteLicence;
	}
	public void setNoteLicence(float noteLicence) {
		this.noteLicence = noteLicence;
	}
	public int getNombreAnnees() {
		return nombreAnnees;
	}
	public void setNombreAnnees(int nombreAnnees) {
		this.nombreAnnees = nombreAnnees;
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
	public float getNoteAffectee() {
		return noteAffectee;
	}
	public void setNoteAffectee(float noteAffectee) {
		this.noteAffectee = noteAffectee;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
    
        
    
    
}
