package slokam.hospital.unittest;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import slokam.hospital.Controller.AppointmentController;
import slokam.hospital.entity.Appointment;


@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("slokam.hospital.Controller,slokam.hospital.Service,slokam.hospital.daos")
public class AppintmentGetUnitTest {

	@Autowired
	AppointmentController appcontroller;
	
	@Test
	public void appointmenttest(){
		
		Appointment app= new Appointment();
		app.setDateTime(new Date());
		app.setPrimaryReason("fever");
		appcontroller.saveAppointment(app);
		
		List<Appointment>list=appcontroller.getallappointment();
		Assert.assertEquals(1,list.size());
		System.out.println(list.size());
		System.out.println(list.get(0).getPrimaryReason());
		System.out.println(list.get(0).getDateTime());
		
		
		
		
	}
}
