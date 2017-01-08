package babySitterKata;

public class NightlyRate {

	private int rateStartLimitToBedtime = 12;
	private int rateBedtimeToMidnight;
	private int rateMidnightToEndLimit;
	private int startTimeLimit = 17; // military time
	private int bedTime = 20; // 8pm
	private int midNight = 24;
	private int endTimeLimit = 28; // military time of 12a + each hour after up
									// to 4am
	private int startTime = 18;
	private int endTime = 27;

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
		return endTime;
	}

	public int get8DollarRate() {
		return rateStartLimitToBedtime;
	}

	public int getBabySitterHours() {
		int rate12Hours = 0;
		int rate16Hours = 0;
		int rate8Hours = 0;

		for (int i = getStartTime(); i < getEndTime(); i++) {

			if (i < bedTime) {
				rate12Hours++;
			}

			else if (i < midNight) {
				rate8Hours++;
			} else {
				rate16Hours++;
			}
		}
		return rate12Hours + rate8Hours + rate16Hours;
	}

}
