// Calculate the factorial of a number
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Factorial s = new Factorial();
        System.out.println(s.factorial(count));
    	sc.close();
    }
public int factorial(int count){
    int fact = count;
    if(count == 1){
        return 1;
    }
    else{
        fact = fact * factorial(count-1);
        return fact;
    }
}
}
