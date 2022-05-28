public class solution {

	// Return the updated string
    
    
	public static String addStars(String s) {
		// Write your code here
             //return haha(s,0);
              if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0)+ "*" +addStars(s.substring(1));
        }
        return s.charAt(0)+addStars(s.substring(1));
	}
}

