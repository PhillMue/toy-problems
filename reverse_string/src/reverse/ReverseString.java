// Write a java algorithm to reverse a string, and print it's output
// For instance, "CodeNinja" returns: 'ajniNedoC'

package reverse;
import java.util.Scanner;
public class ReverseString {

	
	
	public static void main(String[] args) {
		String initial, reverse = "";
	      Scanner input = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      initial = input.nextLine();
	 
	      int length = initial.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + initial.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);

	}

}
