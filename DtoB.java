import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DtoB {

    public static void main(String[] args) {
        System.out.println("Please enter a decimal to convert to binary");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = Integer.toBinaryString(n);
		System.out.println("Input String = "+res);
        char[] resArray = res.toCharArray();
        int best_start_position = 0;
        int best_length = 0;
        int length = 0;
        for(int i = 0; i < resArray.length ; i++){
			if(resArray[i] == '1'){
				length++;
				}
			else if(resArray[i] == '0'){
				length = 0;
				}
			if(length > best_length){
				best_length = length;
				}
			}
		System.out.println(best_length);  //print the number of consecutive 1's

        
        }
}



