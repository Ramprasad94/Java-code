//Given a number, tell if it is prime or not
//Input : number or Q/q to quit.

import java.util.*;

class FindPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Q/q to quit");
		while(sc.hasNext()){
			int flag = 0;
			String num = sc.next();
			if(num.equals("q") || num.equals("Q")){
				break;
			}
			int number = Integer.parseInt(num);
			if((number % 2 == 0 || number == 1) && number != 2){
				flag = 1;
			}
			for(int i = 3; i*i <= number ; i = i+2){
				if(number % i == 0){
					flag = 1;
				}
			}
			if(flag == 1){
				System.out.println("Not prime");
			}
			else{
				System.out.println("Prime");
			}
		}

	}
}