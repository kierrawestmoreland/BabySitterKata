package babySitterKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NightlyRateTest {
	NightlyRate underTest;	
	
	@Before 
	public void runBeforeEachTest(){
		underTest = new NightlyRate();
	}
	
	@Test
	public void getBabySitterStartTimeLimit(){
		assertEquals(17, underTest.getStartTimeLimit());
	}
	
	@Test 
	public void getBabySitterEndTimeLimit(){
		assertEquals(28, underTest.getEndTimeLimit());
	}
	
	@Test 
	public void babySitterStartTimeBewteen17And28(){
		assertTrue(underTest.getStartTime() > 16 && underTest.getStartTime() < 29);
	}
	
	@Test 
	public void babySitterEndTimeBetween17And28(){
		assertTrue(underTest.getEndTime() > 16 && underTest.getEndTime() < 29);
	}
	
	@Test
	public void babySitterGetsPaid8DollarsForFirstRate(){
		assertEquals(12, underTest.get8DollarRate() * 1);
	}

	@Test 
	public void babySitterHoursWorked(){
		assertEquals(9, underTest.getBabySitterHours());
	}
	
	@Test
	public void babySitterTotalPayForHoursWorked(){
		assertEquals(104, underTest.getBabySitterTotalPay());
	}
		
}
	
