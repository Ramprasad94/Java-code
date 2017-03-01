//program to modify the kth bit of a number to 0 if it is 1.

import java.io.*;
import java.util.*;

public class GFG{
	public static void main(String args[]){
		int final_result = 0;
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter k:");
		int k = sc.nextInt();
		//convert n to a binary number
		int binary_n = 0, i = 1;
		while(n != 0){
			int remainder = n%2;
			n = n/2;
			binary_n = binary_n + (remainder*i);
			i = i * 10;
		}
		System.out.println("The binary representation is: "+binary_n);
		String n_string = Integer.toString(binary_n);
		if(n_string.charAt(k+1) == '1'){
			System.out.println("1 has been found");
			char[] n_charArray = n_string.toCharArray();
			n_charArray[k-1] = '0';
			String temp = new String(n_charArray);
			final_result = Integer.parseInt(temp);
			System.out.println("The final output is: "+ final_result);
		}
		else{
			System.out.println("1 has not been found");
		}
	
		//converting the decimal back to binary

		System.out.println("Given binary representation: "+final_result);
		int temp_val = final_result;
		int final_val = 0;
		int iterator = 0;
		while(temp_val != 0){
			int new_rem = temp_val%10;
			final_val = final_val+(int)(Math.pow(2,iterator) * new_rem);
			iterator++;
			temp_val = temp_val/10;
		}
		System.out.println(final_val);


	}
}