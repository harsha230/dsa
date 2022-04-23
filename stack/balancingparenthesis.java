import java.util.*;
public class Solution {

    public static boolean isBalanced(String e) {
        //Your code goes here
        if(e.charAt(0)==')')
            return false;
            
        
        Stack<Character> l=new Stack<Character>();
        for(int i=0;i<e.length();i++){
            char c=e.charAt(i);
           if(c=='('){
               l.push(c);
           } 
           else if(c==')'){
               if(l.isEmpty()){
                   return false;
               }
               else {
                   if(l.peek()=='('){
                       l.pop();
                       
                       continue;}
               }
           }   
        }
        if(l.size()!=0)
            return false;
        
        
       return true; 
    }
}
