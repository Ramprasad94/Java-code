//Program to extract information from inputstring separated by @ and give the count of numbers present
//InputString = Blk,Blackrock,25@MS,Microsoft,77@AP,Apple,56

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class ExtractStrings{

	public static void main(String args[]){
		ExtractStrings es = new ExtractStrings();
		System.out.println("Enter the string separated by @");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		es.stringExtract(input);
		sc.close();
	}

	void stringExtract(String input){
		String[] string_array = new String[input.length()];
		String SEPARATOR = "@";
		string_array = input.split(SEPARATOR);
		for(int k = 0; k < string_array.length; k++){
			String[] temp = string_array[k].split(",");
			Portfolio pf = new Portfolio();
			pf.setTicker(temp[0]);
			pf.setName(temp[1]);
		
			Pattern p = Pattern.compile("[0-9]+");
			for(String iter : temp){
					
					Matcher m = p.matcher(iter);
					if(m.find()){
						pf.setShares(m.group());
					}
			}
			printPortfolio(pf);
			if(k != string_array.length-1){
			System.out.print(", ");
			}
		}// end of outer for loop
		System.out.println("");
	}// end of stringExtract

	void printPortfolio(Portfolio pf){
		String ticker_s = pf.getTicker();
		String name_s = pf.getName();
		String shares_s = pf.getShares();
		System.out.print("["+ticker_s+", "+name_s+", "+shares_s+"]");
	}


}// end of Class


class Portfolio{
	
	String ticker;
	String name;
	String shares;

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

	void setTicker(String ticker){
		this.ticker = ticker;
	}

	String getTicker(){
		return this.ticker;
	}

	void setShares(String shares){
		this.shares = shares;
	}

	String getShares(){
		return this.shares;
	}
}