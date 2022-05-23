public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        if(n<=0)
            return 0;
        if(n==1)
            return 0;
        if((n-1)%3==0){
             return 1+countMinStepsToOne(n-1);
        }
        if(n%3==0){
            return 1+countMinStepsToOne(n/3);
        }
        if(n%2==0)
            return 1+countMinStepsToOne(n/2);
        else
            return 1+countMinStepsToOne(n-1);
        
        
        
        
	}

}
