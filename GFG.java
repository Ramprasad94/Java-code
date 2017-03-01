//program to modify the kth bit of a number to 0 if it is 1.

import java.io.*;
import java.util.*;

public class GFG{
	public static void main(String args[]){
		long final_result = 0;
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
			
		String n_string = String.format("%08d", binary_n);
		System.out.println("The binary representation is: "+n_string);
		if(k <= n_string.length()){
		if(n_string.charAt(k-1) == '1'){
			System.out.println("1 has been found");
			char[] n_charArray = n_string.toCharArray();
			n_charArray[k-1] = '0';
			String temp = new String(n_charArray);
			System.out.println("Temp is: "+ temp);
			final_result = Integer.parseInt(temp);
		
	
		//converting the decimal back to binary
		System.out.print("Given binary representation: ");
		System.out.format("%08d",final_result);
		long temp_val = final_result;
		long final_val = 0;
		int iterator = 0;
		while(temp_val != 0){
			int new_rem = (int)temp_val%10;
			final_val = final_val+(int)(Math.pow(2,iterator) * new_rem);
			iterator++;
			temp_val = temp_val/10;
			}
		System.out.println("");
		System.out.println("The final value is: "+final_val);
			}
		else{
			System.out.println("1 has not been found");
			}
		
		}
		else{
			System.out.println("k value was larger than the binary representation of n");
		}
		
	}
}