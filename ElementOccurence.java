//Program to find out the first occurence of an element and the last occurence of an element in an input array
//Input: TestCases
//		 number of array elements
//		 all the array elements in sorted order
// 	 	 the number to be searched
import java.util.*;
import java.lang.*;
import java.io.*;

class ElementOccurence {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases > 0){
		    int arraySize = sc.nextInt();
		    int[] array = new int[arraySize];
		    for(int i = 0; i < arraySize; i++){
		        array[i] = sc.nextInt();
		    }
		    int searchElement = sc.nextInt();
		    int[] indexes = new int[array.length];
		    int k = 0;
		    for(int j = 0; j < array.length; j++){
		        if(array[j] == searchElement){
		            indexes[k] = j;
		            k++;
		        }
		    }
		    if(k != 0){
		    System.out.println(indexes[0]+" "+indexes[k-1]);
		    }
		    else{
		        System.out.println("Element not found in the input array");
		    }
		    testCases -= 1;
		}
	}
}