package Hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	private static final String HI = "Hi ";

	public static void main(String[] args) throws IOException {
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        
        // Reading data using readLine
        System.out.println("Enter your name:");
        String name = reader.readLine();
        
        System.out.println("Enter your surname:");
        String surname = reader.readLine();
        
		System.out.println(HI + name + " " + surname);
		System.out.println("Sum of 5+10 is " + (5+10));
	}

}