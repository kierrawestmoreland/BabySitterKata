package babySitterKata;

public class NightlyRate {
	
	private int rateStartLimitToBedtime = 12;
	private int rateBedtimeToMidnight;
	private int rateMidnightToEndLimit;
	private int startTimeLimit = 17; //military time
	private int endTimeLimit = 28; //military time of 12a + each hour after up to 4am
	private int startTime = 18;
	private int endTime = 25;
	
	
	public int getStartTimeLimit() {
		return startTimeLimit;
	}

	public int getEndTimeLimit() {
		return endTimeLimit;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		// TODO Auto-generated method stub
		return endTime;
	}

	public int get8DollarRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	

	
	
}
