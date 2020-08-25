/*
jlo214
07/2020
https://www.hackerrank.com/challenges/java-stack/problem
*/
import java.util.*;

class JavaStack {
	
	public static void main(String []argh) {
		Scanner sc = new Scanner(System.in);
        List<String> sList = new ArrayList<>();
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            sList.add(input);
		}
        isBalanced(sList);
        sc.close();
	}

    public static void isBalanced(List<String> sList){

        for(int i=0; i<sList.size(); i++){
            String s = sList.get(i);
            Stack<String> stack = new Stack<>();
            boolean balanced = true;

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '{' || s.charAt(j) == '(' || s.charAt(j) == '[' ){
                    stack.push(String.valueOf(s.charAt(j)));
                }
                else{
                    try{
                        String stackVal = stack.pop();
                        if( s.charAt(j) == '}' ){
                            if( !stackVal.equals("{") ){
                                balanced = false; 
                                break;
                            }
                        }
                        if( s.charAt(j) == ')' ){
                            if( !stackVal.equals("(") ){
                                balanced = false;
                                break;
                            }
                        }
                        if( s.charAt(j) == ']' ){
                            if( !stackVal.equals("[") ){
                                balanced = false;
                                break;
                            }
                        }
                    }
                    catch(Exception e){
                        balanced = false;
                    }
                }
            } 
            if(balanced && stack.isEmpty()) 
                System.out.println("true");
            else
                System.out.println("false");
        }        
    }
}