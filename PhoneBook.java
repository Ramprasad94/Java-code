//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBook{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mp.put(name,phone);
        }
        
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); 
    }
        
        while(in.hasNext()){
            String s = in.next();
		    if(mp.get(s) != null){
			System.out.println("Found");
			}
			else{
			System.out.println("Not Found");	
			}
		}
        in.close();
    }
}
