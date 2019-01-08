package slokam.hospital.unittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {
	

private static final Logger logger =LoggerFactory.getLogger(LogBackTest.class);
	public static void main(String[] args) {
		
	
	
	logger.debug("This is a debug message.");
    logger.info("This is an info message.");
    logger.warn("This is a warn message.");
    logger.error("This is an error message.");

}
}