import java.lang.*;
public class solution {

	// Return the changed string
	public static String removeX(String st){
		// Write your code here
        if(st.length()==0)
            return st;
        String p=removeX(st.substring(1));
        if(st.charAt(0)=='x')
            return p;
        else 
            return st.charAt(0)+p;
	}
}

