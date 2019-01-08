package slokam.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slokam.hospital.daos.AppointmentDao;
import slokam.hospital.entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDao appointmentdao;
	
	public void saveAppointment(Appointment app){
	
		appointmentdao.save(app);
		
	}
	
	public void saveAllAppointment(List<Appointment> app){
		
		appointmentdao.saveAll(app);		
	}
	
	
	public List<Appointment>getallappointment(){
		return appointmentdao.findAll();
	}
}
