package zadaci_03_03_2017;

public class Time {
         
	private long hour;
	private long minute;
	private long second;

	// Kreiranje Time objekta za trenutno vrijeme
	Time() {
		this(0);	
	}

	// Vrijeme koje je proslo od 1. Januara 1970. u milisekundama
	Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	
    // Postavljanje novog vremena koristeci elapsedTime
	public void setTime(long elapsedTime) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

		if (elapsedTime > 0) {
			totalSeconds = elapsedTime / 1000;
			second += totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
			minute += totalMinutes % 60;
			totalHours = totalMinutes / 60;
			hour += totalHours % 24;
		}
	}
}