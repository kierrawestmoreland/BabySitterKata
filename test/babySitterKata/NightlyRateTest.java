package babySitterKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import babySitterKata.NightlyRate;

public class NightlyRateTest {
	
	@Test
	public void getBabySitterStartTimeLimit(){
		NightlyRate underTest = new NightlyRate();
		int startTimeLimit = underTest.getStartTimeLimit();
		assertEquals(17, startTimeLimit);
	}
	
}
