package org.miolacnc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="StudentFiles")
public class StudentFiles {

	@Id
	@GeneratedValue
	private long student_id;
	
	@Lob
	@Column(nullable = false)
	private String semestre1;

	@Lob
	@Column(nullable = false)
	private String semestre2;

	@Lob
	@Column(nullable = false)
	private String semestre3;

	@Lob
	@Column(nullable = false)
	private String semestre4;

	@Lob
	@Column(nullable = false)
	private String semestre5;


	@Lob
	@Column(nullable = false)
	private String semestre6;

	@Lob
	@Column(nullable = false)
	private String preinscriptionFile;

	@Lob
	@Column(nullable = false)
	private String cinFile;

	@Lob
	@Column(nullable = false)
	private String deugFile;

	@Lob
	@Column(nullable = false)
	private String licenceFile;
	
	public String getSemestre1() {
		return semestre1;
	}
	public void setSemestre1(String semestre1) {
		this.semestre1 = semestre1;
	}
	public String getSemestre2() {
		return semestre2;
	}
	public void setSemestre2(String semestre2) {
		this.semestre2 = semestre2;
	}
	public String getSemestre3() {
		return semestre3;
	}
	public void setSemestre3(String semestre3) {
		this.semestre3 = semestre3;
	}
	public String getSemestre4() {
		return semestre4;
	}
	public void setSemestre4(String semestre4) {
		this.semestre4 = semestre4;
	}
	public String getSemestre5() {
		return semestre5;
	}
	public void setSemestre5(String semestre5) {
		this.semestre5 = semestre5;
	}
	public String getSemestre6() {
		return semestre6;
	}
	public void setSemestre6(String semestre6) {
		this.semestre6 = semestre6;
	}
	public String getPreinscriptionFile() {
		return preinscriptionFile;
	}
	public void setPreinscriptionFile(String preinscriptionFile) {
		this.preinscriptionFile = preinscriptionFile;
	}
	public String getCinFile() {
		return cinFile;
	}
	public void setCinFile(String cinFile) {
		this.cinFile = cinFile;
	}
	public String getDeugFile() {
		return deugFile;
	}
	public void setDeugFile(String deugFile) {
		this.deugFile = deugFile;
	}
	public String getLicenceFile() {
		return licenceFile;
	}
	public void setLicenceFile(String licenceFile) {
		this.licenceFile = licenceFile;
	}
	
	
}
