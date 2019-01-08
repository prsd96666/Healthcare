package slokam.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import slokam.hospital.Service.AppointmentService;
import slokam.hospital.entity.Appointment;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appser;
	
	@PostMapping
	public void saveAppointment(@RequestBody Appointment app){
		appser.saveAppointment(app);
		
	}
	
	@PostMapping("/all")
	public void saveAllAppointment(@RequestBody  List<Appointment> app){
		appser.saveAllAppointment(app);
	}
	
	@GetMapping("/getall")
	public List<Appointment>getallappointment(){
		 return appser.getallappointment();
		
		
	}
	
}
