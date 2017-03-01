//Given a string with a word and a number, find out if the length of string is equal to given number
// Output: 1  - equal
// Output: 0 - not equal
import java.util.*;

public class Problem1{
	public static void main(String args[]){
		System.out.println("Enter the string with a number at the end");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//conver the string to a character array
		char[] input_array = input.toCharArray();
		char temp = input.charAt(input.length()-1);
		int store_number = Character.getNumericValue(temp);
		if(input_array.length-1 == store_number){
			System.out.println(1);
		}
		else System.out.println(0);
		sc.close();
	}
}

