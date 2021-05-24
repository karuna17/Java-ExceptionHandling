import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MoodAnalyser {

	@Test
	public String analyseMood(String msg) {
		if(msg.contains("Happy")) {
			return "HAPPY";
		}else if(msg.contains(null)) {
			return "Invalid Mood";
		}else {
			return "SAD";
		}
	}

	@Test
	public void test() {
		MoodAnalyser m = new MoodAnalyser();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mood");
		String message	= sc.next();
		m.analyseMood(message);
		System.out.println(message);
	}

}
