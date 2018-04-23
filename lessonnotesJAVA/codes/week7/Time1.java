
public class Time1 {

	private int hour; // 0-23
	private int minute; // 0-59
	private int second; //

	public void setTime(int hour, int minute, int second) {
		if(hour < 0 || hour >=24 || minute <0 || minute >=60 || second <0 || second >=100) {
			throw new IllegalArgumentException("hour, minute or second is invalid!");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d %s", (hour == 0 || hour == 12)? 12:hour%12,minute,second, (hour>12)? "PM": "AM");
	}
}