package adapterpattern.adaptees;

import java.time.LocalDate;
import java.util.*;

import adapterpattern.model.Diagnosis;

public class RegionMidAdaptee {

	private List<Diagnosis> diagnoses = new ArrayList<>(
			Arrays.asList(new Diagnosis("121265-9999", LocalDate.of(1997, 1, 1), "AS-224532"),
					new Diagnosis("121265-9999", LocalDate.of(2013, 4, 22), "IA-6568")));
	
	public List<Diagnosis> getDiagnoses(int year, String ssn) {
	    List<Diagnosis> result = new ArrayList<>();
	    for (Diagnosis diagnosis : diagnoses) {
	        if (diagnosis.getSocialSecurityNumber().equals(ssn) && diagnosis.getDateOfDiagnosis().getYear() == year) {
	            result.add(diagnosis);
	        }
	    }
	    return result;
	}

}