//Program to encrypt the input string into the character followed by its count
//example: rama = r1a2m1
//TIP: Use a linkedhashmap to preserve the ordering of the elements


import java.util.*;
import java.io.*;

public class Encrypt{
		
	public static void main(String args[]){
		int char_counter = 0; 
		String final_string = "";
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] input_array = input.toCharArray();
		LinkedHashMap<Character,Integer> hmap = new LinkedHashMap<Character,Integer>();
		
		
		// add counter value to hashmap and increment it every time it encounters a new char
		for(char iter : input_array){
			hmap.put(iter,0);
		}
		
		
		for(Map.Entry<Character,Integer> entry: hmap.entrySet()){
			char_counter = 0;
			char hit = entry.getKey();
			for(char iter: input_array){
				if(hit == iter){
					char_counter += 1;
				}
			}
			hmap.put(hit,char_counter);
		final_string = final_string + hit + Integer.toString(char_counter);
		}	
		//print out the hashmap
		for(Map.Entry<Character,Integer> entry: hmap.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println(final_string);
	}
}




