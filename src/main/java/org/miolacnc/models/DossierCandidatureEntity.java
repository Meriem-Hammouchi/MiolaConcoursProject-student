package org.miolacnc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DossierCandidature")
public class DossierCandidatureEntity {

	 @Id
	 @GeneratedValue
	 private long id;
	 
	 @Column(nullable = false,length = 50 )
     private String nomEtudiant;
	 
	 @Column(nullable = false, length = 50)
     private String prenomEtudiant;
	 
	 @Column(nullable = false, length = 50, unique = true)
     private String cin;
	 
	 @Column(nullable = false, length = 100)
     private String email;
	 
	 @Column(nullable = false)
     private boolean admis = false;
	 
	 public boolean isAdmis() {
		return admis;
	}
	public void setAdmis(boolean admis) {
		this.admis = admis;
	}
	@Column(nullable = false, length = 10)
	 private float noteS1;
	 
	 @Column(nullable = false, length = 10)
	 private float noteS2;
	  
	 @Column(nullable = false, length = 10)
	 private float noteS3;
	 
	 @Column(nullable = false, length = 10)
	 private float noteS4;
	 
	 @Column(nullable = false, length = 10)
	 private float noteS5;
	 
	 @Column(nullable = false, length = 10)
	 private float noteS6;
	 
	 @Column(nullable = false, length = 10)
	 private float noteLicence;
	 
	 @Column(nullable = false, length = 10)
     private int nombreAnnees;
	 
	 @Column(nullable = false)
	 private String statut="undefined";
	 
	 @Column(nullable = false, length = 10)
	 private float noteAffectee;
	 
	 @Column(nullable = false)
     private String path;
	 
	 @Column(nullable = false)
     private long juryId;
     
	 
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
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
	public long getJuryId() {
		return juryId;
	}
	public void setJuryId(long juryId) {
		this.juryId = juryId;
	}
	
}
