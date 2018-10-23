package com.uas.bean;

public class ProgramBean {
	String programName;
	String description;
	String eligibility;
	int dureation;
	String certificateOffered;
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public int getDureation() {
		return dureation;
	}
	public void setDureation(int dureation) {
		this.dureation = dureation;
	}
	public String getCertificateOffered() {
		return certificateOffered;
	}
	public void setCertificateOffered(String certificateOffered) {
		this.certificateOffered = certificateOffered;
	}
	public ProgramBean(String programName, String description,
			String eligibility, int dureation, String certificateOffered) {
		super();
		this.programName = programName;
		this.description = description;
		this.eligibility = eligibility;
		this.dureation = dureation;
		this.certificateOffered = certificateOffered;
	}
	public ProgramBean() {
	}

}
