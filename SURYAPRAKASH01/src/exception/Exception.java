package exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception {
	static String acceptText() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the string: ");
			String str = br.readLine();
			
			return str;
		}
	}



}
