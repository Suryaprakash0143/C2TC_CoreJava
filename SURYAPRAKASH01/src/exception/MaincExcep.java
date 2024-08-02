package exception;
import java.io.IOException;

public class MaincExcep {

	public static void main(String[] args) {
		
				try {
					String str = Exception.acceptText();
					System.out.println("Your string is " + str);
				} catch (IOException e) {
					System.err.println("An error occurred while reading input: " + e.getMessage());
				}
			}
		}

	
