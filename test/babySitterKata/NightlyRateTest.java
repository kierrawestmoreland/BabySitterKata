package babySitterKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class NightlyRateTest {
	
	@Test
	public void getBabySitterStartTimeLimit(){
		NightlyRate underTest = new NightlyRate();
		int startTimeLimit = underTest.getStartTimeLimit();
		assertEquals(17, startTimeLimit);
	}
	
	@Test 
	public void getBabySitterEndTimeLimit(){
		NightlyRate underTest = new NightlyRate();
		int endTimeLimit = underTest.getEndTimeLimit();
		assertEquals(28, endTimeLimit);
	}
	
	@Test 
	public void babySitterStartTimeBewteen17And28(){
		NightlyRate underTest = new NightlyRate();
		int startTime = underTest.getStartTime();
		assertTrue(startTime > 16 && startTime < 29);
	}
	
	@Test 
	public void babySitterEndTimeBetween17And28(){
		NightlyRate underTest = new NightlyRate();
		int endTime = underTest.getEndTime();
		assertTrue(endTime > 16 && endTime < 29);
	}
	
	@Test
	public void babySitterGetsPaid8DollarsForFirstRate(){
		NightlyRate underTest = new NightlyRate();
		int firstRateHours = 1;
		int rateStartLimitToBedTime = underTest.get8DollarRate();
		assertEquals(12, rateStartLimitToBedTime * firstRateHours);
	}

	@Test 
	public void babySitterHoursWorked(){
		NightlyRate underTest = new NightlyRate();
		int hoursWorked = underTest.getBabySitterHours();
		assertEquals(9, hoursWorked);
	}
		
}
	
