import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     String[] inputStringArray = new String[sc.nextInt()]; 
     
     for (int i =0; i < inputStringArray.length; i++){ //every String is taken up depending on T
     String inputString = sc.next();
     char[] inputStringToChar = inputString.toCharArray();
     int k = 0, l = 0;
     char[] tempOddArray = new char[inputStringToChar.length];
     char[] tempEvenArray = new char[inputStringToChar.length];
	 for(int j = 0 ; j< inputStringToChar.length; j++){
             if(j%2==0){
              tempEvenArray[k]=inputStringToChar[j];         
             k++;
             }
            else{
             tempOddArray[l]= inputStringToChar[j];   
				l++;
            }}
     String oddString = new String(tempOddArray);
     String evenString = new String(tempEvenArray);
     System.out.print(evenString);   
     System.out.print(" ");
     System.out.print(oddString);   
     System.out.println();
     
     
     }
    sc.close();
    }
}
