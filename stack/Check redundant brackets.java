import java.util.*;
public class Solution {

	public static boolean checkRedundantBrackets(String e) {
		//Your code goes here
        Stack <Character> s=new Stack<>();
        int j=0;
       for(int i=0;i<e.length();i++){
          if(e.charAt(i)!=')') {
              s.push(e.charAt(i));
          }
           else if(e.charAt(i)==')'){
              
              while(s.peek()!='(' && s.isEmpty()==false) {
                 s.pop();
                  j++;
           }
           if(s.peek()=='('){
               s.pop();
           }    
         if(j==0 || j==1)
             return true;
      
           if(s.isEmpty()==true)
               return false;
           else 
               j=0;          
       } 
         
	}
        if(j!=0)
             return false;
        return true;
}}
