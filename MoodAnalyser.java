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
		String message = m.analyseMood("Happy");
		System.out.println(message);
	}

}
