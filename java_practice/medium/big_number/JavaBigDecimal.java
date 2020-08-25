/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-bigdecimal/problem
*/
import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        //had the idea down but looked up syntax
        Arrays.sort(s,0,n,Collections.reverseOrder(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //convert to big decimal inside comparator
                //so permanent string values are never changed
                //compare the strings!
                BigDecimal d1 = new BigDecimal(s1);
                BigDecimal d2 = new BigDecimal(s2);
                return d1.compareTo(d2);
            }
        }));

        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}