package babySitterKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import babySitterKata.NightlyRate;

public class NightlyRateTest {
	
	@Test
	public void getBabySitterStartTime(){
		NightlyRate underTest = new NightlyRate();
		int startTime = underTest.getStartTime(1);
		assertEquals(5, startTime);
	}
	
}
