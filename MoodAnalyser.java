import java.util.Scanner;
import org.junit.jupiter.api.Test;

class InvalidMoodException extends Exception{
	public String toString()
	{
		return "Invalid Mood due to you entered null or empty string";
	}
}


class MoodAnalyser {

	@Test
	public String analyseMood(String msg) throws InvalidMoodException {
		if(msg.contains("Happy")) {
			return "HAPPY";
		}else if(msg.contains("NULL")|| msg.contains("")) {
				throw new InvalidMoodException();
		}
		else {
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
		} catch (InvalidMoodException e) {
			e.printStackTrace();
		}
	}

}

