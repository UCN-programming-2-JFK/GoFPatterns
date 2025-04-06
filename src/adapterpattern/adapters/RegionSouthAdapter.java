package adapterpattern.adapters;

import java.util.*;

import adapterpattern.adaptees.RegionSouthAdaptee;
import adapterpattern.model.Diagnosis;

public class RegionSouthAdapter implements DiagnosisRetrieverAdapter {

	@Override
	public List<Diagnosis> getDiagnoses(String socialSecurityNumber) {
		
		return new RegionSouthAdaptee().getAllDiagnosesForPatient(socialSecurityNumber);
	}
}