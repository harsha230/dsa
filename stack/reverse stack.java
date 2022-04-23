import java.util.*;
public class Solution {

	public static void reverseStack(Stack<Integer> i, Stack<Integer> e) {
		//Your code goes here
        
        if(i.isEmpty())
            return ;
        int q=i.pop();
        reverseStack(i,e);
        while(!i.isEmpty()){
            e.push(i.pop());
        }
        i.push(q);
        while(!e.isEmpty()){
            i.push(e.pop());
        }
        return ;
	}
}
