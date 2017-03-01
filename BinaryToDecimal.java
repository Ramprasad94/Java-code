//Program that takes in any binary number and prints its corresponding decimal.
import java.util.*;
import java.io.*;

public class BinaryToDecimal{
	public static void main(String args[]){
		System.out.println("Enter the binary number");
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		long decimal = 0;
		int iter = 0;
		while(binary != 0){
			int remainder = binary % 10;
			decimal += (Math.pow(2,iter) * remainder);
			binary /= 10;
			++iter;
		}
		System.out.println("The decimal representation is: "+decimal);
	sc.close();
	}
}