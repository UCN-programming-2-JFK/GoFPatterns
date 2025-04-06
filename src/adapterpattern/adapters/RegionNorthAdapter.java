package adapterpattern.adapters;

import java.time.LocalDate;
import java.util.*;

import adapterpattern.adaptees.RegionNorthAdaptee;
import adapterpattern.model.Diagnosis;

public class RegionNorthAdapter implements DiagnosisRetrieverAdapter {

	@Override
	public List<Diagnosis> getDiagnoses(String socialSecurityNumber) {
		
		//Adapt to region north way of asking for diagnoses within date interval
		LocalDate fromDate = LocalDate.of(1800, 1,1);
		LocalDate toDate = LocalDate.of(3000,1,1);
		return new RegionNorthAdaptee().getDiagnoses(fromDate, toDate, socialSecurityNumber);
	}
}