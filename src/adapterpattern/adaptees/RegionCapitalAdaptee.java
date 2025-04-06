package adapterpattern.adaptees;

import java.time.LocalDate;
import java.util.*;

import adapterpattern.model.Diagnosis;

public class RegionCapitalAdaptee {

	private List<Diagnosis> diagnoses = new ArrayList<>(
			Arrays.asList(new Diagnosis("121265-9999", LocalDate.of(2003, 6, 23), "FLM-044"),
					new Diagnosis("121265-9999", LocalDate.of(2003, 7, 14), "VIR-21345")));
	
	public List<Diagnosis> getDiagnosesInInterval(String ssn, LocalDate from, LocalDate to){
		return diagnoses;
	}
}