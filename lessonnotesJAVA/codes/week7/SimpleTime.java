
public class SimpleTime {

	private int hout;
	private int minute;
	private int second;

	public SimpleTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String BuildString() {
		return String.format("this.toUniversalString", this.toUniversalString(),"toUniversalString", toUniversalString())
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}