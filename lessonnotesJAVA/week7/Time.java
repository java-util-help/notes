
public class Time {

	public static void main(String[] args) {
		
		Time1 time = new Time1();
		displayTime("Display time before use setTime", time);
		time.setTime(12,13,54);
		displayTime("Display time after use setTime", time);

		try {
			time.setTime(99,99,99);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("%s", e.getMessage());
		}
		displayTime("Display time after catch", time);
	}

	public static void displayTime(String header, Time t) {
		System.out.printf("%s toUniversalString()%s toString()%s", header, t.toUniversalString());
	}
}