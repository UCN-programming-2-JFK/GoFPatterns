package adapterpattern.adapters;

import java.util.List;

import adapterpattern.model.Diagnosis;

public interface DiagnosisRetrieverAdapter {

	public List<Diagnosis> getDiagnoses(String socialSecurityNumber);
}
