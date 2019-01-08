package slokam.hospital.unittest;

import org.junit.Assert;
import org.junit.Test;

import slokam.hospital.unit.Multplication;

public class MultipleTest {

	@Test
	public void verify(){
		
		int a =5;
		
		int b =4;
		
		int expecte= 1;
		
	Multplication  m= new Multplication ();
	
	int actual =m.multiplication(a, b);
	
	Assert.assertEquals(expecte, actual);
				
	
	}
}
