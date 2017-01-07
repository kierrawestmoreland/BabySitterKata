package babySitterKata;

public class NightlyRate {
	
	private int rateStartToBedtime;
	private int rateBedtimeToMidnight;
	private int rateMidnightToEnd;
	private int startTimeLimit = 17; //military time
	private int endTimeLimit = 28; //military time of 12a + each hour after up to 4am
	private int startTime;
	private int endTime;
	
	
	public int getStartTimeLimit() {
		return startTimeLimit;
	}


	public int getEndTimeLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
