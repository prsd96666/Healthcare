package slokam.hospital.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import slokam.hospital.Service.PatientService;
import slokam.hospital.entity.Patient;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
	private PatientService patientservice;
    
    @PostMapping
    public void savepatientdata(@RequestBody Patient ps){
  	
    	patientservice.savepatientdata(ps);
    	
    }
    
    @PostMapping("/all")
    public void saveAllpatientdatas(@RequestBody List<Patient> pa){ 
    	patientservice.saveAllpatientdatas(pa);
   	
   }

    @GetMapping("/byname/{name}")
    public List<Object[]>getPatientByMedicine(@PathVariable("name") String medicineName){
    	
    	return patientservice.getPatientByMedicine(medicineName);
}
	
    @GetMapping("/diseasename/{name}")
    public List<Object> getPatientBydisease(@PathVariable ("name")String diseaseName){
    	
    	return patientservice.getPatientBydisease(diseaseName);
    	
    }

    @GetMapping("/getdoctor/{name}")
    public List<Object>getDoctorBypatient(@PathVariable("name")String patientName){
    	
    	return patientservice.getDoctorBypatient(patientName);
    }
	
    @GetMapping("/getall")
    public List<Patient>getallPatient(){
    	
    	return patientservice.getallPatient();
    }

}
