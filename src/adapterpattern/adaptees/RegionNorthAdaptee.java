package adapterpattern.adaptees;

import java.time.LocalDate;
import java.util.*;

import adapterpattern.model.Diagnosis;

public class RegionNorthAdaptee {

	private List<Diagnosis> diagnoses = new ArrayList<>(
			Arrays.asList(new Diagnosis("121265-9999", LocalDate.of(1971, 1, 3), "7099870"),
					new Diagnosis("121265-9999", LocalDate.of(1983, 11, 4), "2345-1"),
					new Diagnosis("121265-9999", LocalDate.of(2021, 2, 2), "B-48765")));
	
	public List<Diagnosis> getDiagnoses(LocalDate from, LocalDate to, String ssn){
		return diagnoses;
	}
}