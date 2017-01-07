package babySitterKata;

public class NightlyRate {
	
	private int rateStartLimitToBedtime = 12;
	private int rateBedtimeToMidnight;
	private int rateMidnightToEndLimit;
	private int startTimeLimit = 17; //military time
	private int endTimeLimit = 28; //military time of 12a + each hour after up to 4am
	private int startTime = 18;
	private int endTime = 20;
	
	
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
		return rateStartLimitToBedtime;
	}

	public int getHoursWorked() {
		return endTime - startTime;
	}

	public int getBabySitterMoney() {
		return 0;
	}

	
	
	
	

	
	
}
