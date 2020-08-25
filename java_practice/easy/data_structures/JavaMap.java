/*
jlo214
06/2020
https://www.hackerrank.com/challenges/phone-book/problem
*/
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
		
        for(int i=0; i<n; i++){
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phoneBook.put(name, phone);
		}

        /*for (Map.Entry<String, Integer> e : phoneBook.entrySet()) 
            System.out.println(e.getKey() + "="+ e.getValue());*/
		
        while(in.hasNext()){
			String s=in.nextLine();
            if(phoneBook.get(s) != null)
                System.out.println(s+"="+phoneBook.get(s));
            else
                System.out.println("Not found");
		}
        in.close();
	}
}