import java.util.*;
public class Stack {
    Queue <Integer>p;
    Queue <Integer> q;
    int size;
    //Define the data members
    
     

    public Stack() {
        //Implement the Constructor
        p=new LinkedList<>();
        q=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if(p.isEmpty()==true)
            return true;
        return false;
    }

    public void push(int element) {
        //Implement the push(element) function
        
            p.add(element);
        
            size++;
    }

    public int pop() {
        //Implement the pop() function
        if(isEmpty())
            return -1;
        while(p.size()!=1){
            q.add(p.poll());
        }
        int s=p.poll();
        while(!q.isEmpty()){
            p.add(q.poll());
        }
        size--;
        return s;
    }

    public int top() {
        //Implement the top() function
        if(isEmpty())
            return -1;
        while(p.size()!=1){
            q.add(p.poll());
        }
        int s=p.poll();
        while(!q.isEmpty()){
            p.add(q.poll());
        }
        p.add(s);
        return s;
    }
}
