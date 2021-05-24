import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MoodAnalyser {

	@Test
	public String analyseMood(String msg) {
		if(msg.contains("Happy")) {
			return "HAPPY";
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
		try {
			m.analyseMood(message);
		}catch (NullPointerException e) {
			e.printStackTrace();	
		}
		if(message.equalsIgnoreCase("null")) 
		{
			System.out.println("Happy");
		}
	}

}
