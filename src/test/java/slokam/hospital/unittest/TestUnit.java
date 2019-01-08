package slokam.hospital.unittest;

import org.junit.Test;

import junit.framework.Assert;
import slokam.hospital.unit.Unitclass;

public class TestUnit {


	@Test
	public void verifyadd(){
		
		
		int a=20;
		int b=30;
		int expected=50;
		
		Unitclass cal = new Unitclass();
		int actual = cal.calculater(a, b);
		Assert.assertEquals(expected, actual);
	}

	
}
