package p2;

import java.util.Calendar;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private Calendar calendar;

	/**
	 * Sets time to the current time of executing the constructor
	 */
	public Time() {
		calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);

	}

	/**
	 * 
	 * @return hour of the time object
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * 
	 * @return minute of the time object
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * 
	 * @return second of the time object
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * Updates the time in the time object to the current time.
	 */
	public void update() {
		calendar = Calendar.getInstance();// updates calendar with a current Calendar
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
	}

	/**
	 * prints out the time of the time object in HH:MM:SS format
	 */
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
}
