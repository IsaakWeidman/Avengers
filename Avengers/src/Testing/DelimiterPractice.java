package Testing;
import java.util.Scanner;

public class DelimiterPractice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner("Test|String");
		
		scan.useDelimiter("\\|");
		
		while(scan.hasNext()) {
		
		}
		
	}
}
