import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     int testCaseCount = sc.nextInt();
     String[] inputStringArray = new String[testCaseCount];
     for(int count = 0; count < testCaseCount; count++){
		 inputStringArray[count] = sc.next();
	 }
     StringBuilder evenBuild = new StringBuilder();
     StringBuilder oddBuild = new StringBuilder();
     for(int i = 0; i < inputStringArray.length; i++){
		String inputString = inputStringArray[i];
		for(int j = 0 ; j < inputString.length(); j++){
			if(j%2 == 0){
				evenBuild.append(inputString.charAt(j));
				}
			else{
				oddBuild.append(inputString.charAt(j));
				}
			}
		System.out.print(evenBuild.toString());
		System.out.print(" ");
		System.out.print(oddBuild.toString());
		System.out.println();
		evenBuild.delete(0, evenBuild.length());
		oddBuild.delete(0, oddBuild.length());
	}
}
}
