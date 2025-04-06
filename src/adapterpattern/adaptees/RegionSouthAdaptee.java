package adapterpattern.adaptees;
import java.util.*;
import adapterpattern.model.Diagnosis;

public class RegionSouthAdaptee {

	public List<Diagnosis> getAllDiagnosesForPatient(String ssn){
		return new ArrayList<Diagnosis>();
	}
}