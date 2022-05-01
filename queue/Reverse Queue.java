static void reverse(Queue<Integer> q) 
	{ 
	    if(q.isEmpty())
	        return;
	   
	   int x = q.peek();
	   q.remove();
	   
	   reverse(q);
	   q.add(x);
	        
	} 
  	static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) { 
			stack.add(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.isEmpty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		} 
	} 
