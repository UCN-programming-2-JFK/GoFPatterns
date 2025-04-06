package adapterpattern.model;

import java.time.LocalDate;

public class Diagnosis {

	private String socialSecurityNumber;
	private LocalDate dateOfDiagnosis;
	private String diagnosisCode;
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public LocalDate getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}
	public void setDateOfDiagnosis(LocalDate dateOfDiagnosis) {
		this.dateOfDiagnosis = dateOfDiagnosis;
	}
	public String getDiagnosisCode() {
		return diagnosisCode;
	}
	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	public Diagnosis(String socialSecurityNumber, LocalDate dateOfDiagnosis, String diagnosisCode) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfDiagnosis = dateOfDiagnosis;
		this.diagnosisCode = diagnosisCode;
	}
	
	@Override
	public String toString() {
		return "Patient ssn:" + this.getSocialSecurityNumber() + ", date: " + this.getDateOfDiagnosis() + ", diagnosis code: " + this.getDiagnosisCode();
	}
	
}
