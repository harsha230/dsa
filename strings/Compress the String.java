Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa

public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        String s=new String();
       int n = str.length(); 
        for (int i = 0; i < n; i++) { 
  
            // Count occurrences of current character 
            int count = 1; 
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) 
            { 
                count++; 
                i++; 
            } 
              s+=str.charAt(i);
            if(count>1) {
            s+=count;}
            // Print character and its count 
           // System.out.print(str.charAt(i)); 
           // System.out.print(count); 
            
        }
            return s;
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = Solution.getCompressedString(str);
		System.out.println(ans);
		
	}
}
