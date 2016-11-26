import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int best_sum = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
	    }
        } // end of input to the array
        int loop_value = 0;
        int row = 0;
        int col = 0;
        while(row+2 < 6){
			col = 0;
			while(col+2 < 6)
			{
			int sum = 0;
			sum = sum+arr[row][col]+arr[row][col+1]+arr[row][col+2]+arr[row+1][col+1]+arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
			System.out.println("Sum = "+sum);
			if(row == 0 && col == 0){
				best_sum = sum; // setting the best_sum of the very first iteration to satisfy negative input values to the matrices.
				}
			if(sum > best_sum){
				best_sum = sum;
			}
			col += 1;	
		}
			row += 1;
		}
		System.out.println("The best sum is: "+best_sum);
		
    }
}
