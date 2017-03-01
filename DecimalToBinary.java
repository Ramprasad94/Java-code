//Program converts decimal number to a binary number
import java.io.*;
import java.util.*;

public class DecimalToBinary{
	
	public static void main(String args[]){

			int binary = 0, i = 1;
			System.out.println("Enter the decimal number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if(number < 0){
				System.out.println("Enter a number that is greater than 0");
			}
			else{
				while(number != 0){
				int remainder = number%2;
				number = number/2;
				binary = binary + (remainder*i);
				i = i * 10;
				}
			}
			System.out.println(binary);
	}
}