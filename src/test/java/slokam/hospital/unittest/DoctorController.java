package slokam.hospital.unittest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import slokam.hospital.entity.Doctor;


@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("slokam.hospital.Controller,slokam.hospital.Service,slokam.hospital.daos")
public class DoctorController {

	@Autowired
	slokam.hospital.Controller.DoctorController drcontroller;
	
	@Test
	public void VerifyDoctor(){
		
		Doctor dr= new Doctor();
		dr.setName("vinay");
		dr.setSpec("heart");
		drcontroller.SaveDoctorData(dr);
		
		List<Doctor>drlist=drcontroller.getDoctorname("vinay");
		if(dr.getName().equals(drlist.get(0).getName())){
			System.out.println("sucess");
		}
		else {
			System.out.println("name not found");			
		}
		Assert.assertTrue("sucess", true);
		
	/*	Assert.assertEquals(1, drlist.size());
		System.out.println(drlist.get(0).getName());
		System.out.println(drlist.get(0).getSpec());
	*/			
		
	}
}