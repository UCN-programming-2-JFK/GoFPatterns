package adapterpattern.adapters;

import java.time.LocalDate;
import java.util.*;

import adapterpattern.adaptees.RegionMidAdaptee;
import adapterpattern.model.Diagnosis;

public class RegionMidAdapter implements DiagnosisRetrieverAdapter {

	@Override
	public List<Diagnosis> getDiagnoses(String socialSecurityNumber) {
		RegionMidAdaptee regionMidDiagnosisRetriever = new RegionMidAdaptee();
		List<Diagnosis> diagnoseCollection = new ArrayList<Diagnosis>();
		for (int year = 1950; year < LocalDate.now().getYear(); year++) {
			for(Diagnosis diagnosis: regionMidDiagnosisRetriever.getDiagnoses(year, socialSecurityNumber)) {
				diagnoseCollection.add(diagnosis);
			}
			
		}
		return diagnoseCollection;
	}
}