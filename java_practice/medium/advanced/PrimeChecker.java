/*
jlo214
07/2020
https://www.hackerrank.com/challenges/prime-checker/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {

    void checkPrime(int ...a) {
        int l = a.length;
        boolean prime = true;
        StringBuilder res = new StringBuilder();

        for(int i=0; i<l; i++){
            prime = true;
            if(a[i] <= 1)
                prime = false;            
    
            // Check from 2 to n-1 
            for (int j = 2; j< a[i]; j++) {
                if (a[i] % j == 0) {
                    prime = false; 
                    break;
                }
            }    
 
            if(prime)
                res.append(a[i]+" ");            
        }
        System.out.println(res);
    }

}
public class PrimeChecker {

	public static void main(String[] args) {
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++) {
				if(set.contains(methods[i].getName())) {
					overload=true;
					break;
				}
				set.add(methods[i].getName());			
			}
			if(overload)		
				throw new Exception("Overloading not allowed");		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}