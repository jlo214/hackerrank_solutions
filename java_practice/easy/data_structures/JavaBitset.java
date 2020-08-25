/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-bitset/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int bLen = in.nextInt();
        int opNum = in.nextInt();
        BitSet b1 = new BitSet(bLen);
        BitSet b2 = new BitSet(bLen);        

        for(int i=0; i<opNum; i++){
            String op = in.next();
            int val1 = in.nextInt();
            int val2 = in.nextInt();

            if(op.equalsIgnoreCase("AND")){
                if(val1 == 1)
                    b1.and(b2);
                else
                    b2.and(b1);
            }
            else if(op.equalsIgnoreCase("OR")){
                if(val1 == 1)
                    b1.or(b2);
                else
                    b2.or(b1);
            }
            else if(op.equalsIgnoreCase("XOR")){
                if(val1 == 1)
                    b1.xor(b2);
                else
                    b2.xor(b1);
            }
            else if(op.equalsIgnoreCase("FLIP")){
                if(val1 == 1)
                    b1.flip(val2);
                else
                    b2.flip(val2);
            }
            else if(op.equalsIgnoreCase("SET")){
                if(val1 == 1)
                    b1.set(val2);
                else
                    b2.set(val2);
            }                
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
        in.close();        
    }
}