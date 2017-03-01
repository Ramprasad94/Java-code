//Progam to captitalize initial alphabets and also return the sum of new strings
import java.io.*;
import java.util.*;

public class StringLength {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first string");
        String A=sc.next();
		System.out.println("Please enter the second string");
        String B=sc.next();
		System.out.println("Length of string A is "+A.length());
		System.out.println("Length of string B is "+B.length());
		int result = A.length()+B.length();
		System.out.println("Length of sum is: "+result);
		int val = A.compareTo(B);
    	if(val > 0){
    		System.out.println("Yes");
    	}
    	else{
    		System.out.println("No");
    	}
    	System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length()));
    	System.out.println(B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    	sc.close();
	}
}
