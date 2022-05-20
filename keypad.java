public class solution {

	// Return a string array that contains all the possible strings
    
    public static String get(int d){
        
        if(d==2)
            return "abc";
        if(d==3)
            return "def";
        if(d==4)
            return "ghi";
        if(d==5)
            return "jkl";
        if(d==6)
            return "mno";
        if(d==7)
            return "pqrs";
        if(d==8)
            return "tuv";
        if(d==9)
            return "wxyz";
        return "";
        
    }
    
    
	public static String[] keypad(int n){
		// Write your code here
    if(n==0){
        String[] o=new String[1];
        o[0]="";
        return o;
    }
     String[] so=keypad(n/10);
     int k=0;
     String ld=get(n%10);
     String[] o=new String[ld.length()*so.length];
     for(String s:so){
    	for(int i=0;i<ld.length();i++){
            o[k]=s+ld.charAt(i);
            k++;
        }
     }
        return o;
        
        
        
        
}
	
}

