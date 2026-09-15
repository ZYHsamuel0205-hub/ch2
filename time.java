public class time {

	public static void main (String[] arg) {
	int hour = 12;
	int minute = 20;
	int second = 34;
	int hourCurrent = 12;
	int minuteCurrent = 50;
	int secondCurrent = 23;
	int timePassed = hour * 3600 + minute * 60 + second;
	int timeRemaining = 86400 - hour * 3600 - minute * 60;
	double percent = timePassed / 86400.0 * 100;
	int timePassedSinceStarted = (hourCurrent * 3600 + minuteCurrent * 60 + secondCurrent) - timePassed;
	
	System.out.print("Current time: ");
	System.out.print(hourCurrent + "hr: ");
	System.out.print(minuteCurrent + "min: ");
	System.out.println(secondCurrent + "sec");
	
	System.out.println("Number of seconds since midnight: " + timePassed + " seconds");
	
	System.out.println("Number of seconds remaining in the day: " + timeRemaining + " seconds");
	
	System.out.println("Percentage of the day that has passed: " + percent + "%");

	System.out.println("Time passed since I started working on this exercise: " + timePassedSinceStarted + " seconds");
	}

}
