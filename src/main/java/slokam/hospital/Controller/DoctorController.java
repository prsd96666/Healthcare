package slokam.hospital.Controller;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import slokam.hospital.daos.DoctorDao;
import slokam.hospital.entity.Doctor;


@RestController
public class DoctorController {
	
	@Autowired
	private DoctorDao doctordao;
	
	@RequestMapping("SaveDoctorData")
	public void SaveDoctorData(@RequestBody Doctor dr){
		doctordao.save(dr);
	}
	

	@RequestMapping("SaveallDoctorData")
	public void SaveAllDoctorData(@RequestBody List<Doctor> dr){
		doctordao.saveAll(dr);
	}
	

	@RequestMapping("/{name}")
	public List<Doctor>getDoctorname(@PathVariable (name="name")String name){
		return doctordao.findByName(name);
	}
	
	}