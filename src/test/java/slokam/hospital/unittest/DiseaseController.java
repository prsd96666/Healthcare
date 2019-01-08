package slokam.hospital.unittest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

//import slokam.hospital.entity.Diseases;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("slokam.hospital.Controller,slokam.hospital.Service,slokam.hospital.daos")
public class DiseaseController {

	//@Autowired
	//slokam.hospital.Controller.DiseaseController disc;

	//@Test
	//public void verifyDisease() {

		// prepare DiseasePojo
	/*	Diseases d = new Diseases();
		// Get Id Before Save
		System.out.println("ID Before-Save");
		System.out.println(d.getId());

		Long lo = d.getId();
		System.out.println(lo);
		Assert.assertNotNull(lo);
	}
	
	public void verifyDiseaseWithName(){
		
		//prepare Disease pojo
		
		Diseases d1= new Diseases();
		d1.setName("cold");
		disc.SaveDiseasesData(d1);		
	}

	@Rule
	public ExpectedException exp=ExpectedException.none();
	
	public void verifyDiseaseWithOutName() throws Exception {
		
		exp.expect(DataValidationException.class);
		exp.expectMessage("Please provide Disease Name");
	
		Diseases d1= new Diseases();
		d1.setName("cold");
		disc.SaveDiseasesData(d1);
	}
*/	
}
