package slokam.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slokam.hospital.daos.PatientDao;
import slokam.hospital.entity.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientDao dao;
	
 public void savepatientdata(Patient pa){ 
	 dao.save(pa);
	 
 }
 public void saveAllpatientdatas(List<Patient> pa){ 
	 dao.saveAll(pa);
	
}
 
 
 public List<Object[]>getPatientByMedicine(String medicineName){
	 
	return dao.getPatientByMedicine(medicineName);
 }
 
	public List<Object>getPatientBydisease(String diseaseName){
		
		return dao.getPatientBydisease(diseaseName);
	}
	
	public List<Object>getDoctorBypatient(String patientName){
		
		return dao.getDoctorBypatient(patientName);
	}

	public List<Patient>getallPatient(){
		return dao.findAll();
		
	}
 
 }
