
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */

class dynamicarray{
       private int d[];
       private int n;
       dynamicarray(){
           d=new int[100];
           n=0;
		}
      void doublecap(){
          int[] t= d;
          d=new int[t.length*2];
              for(int i=0;i<t.length;i++){
              d[i]=t[i];}
 			}
      int size(){
		return n;	
      }
    void add(int i,int c){
       if(n>=d.length){
         doublecap();  		
       }
       d[i]=c;
        n++;
    }
    int get(int i){
        if(size()==0)
            return 0;
         if(i>=d.length)
             return 0;
		return d[i];
    }
    int degree(){
        if(size()==0)
            return 0;
         int ma=0;
        int i=0;
        while(i!=d.length){
            if(d[i]!=0){
            ma=Math.max(ma,i);}
            i++;
        }
		return ma;
    }
    
    
    
}
public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    dynamicarray c=new dynamicarray();
    public void setCoefficient(int degree, int coeff){
		c.add(degree,coeff);     
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<c.size();i++){
            if(c.get(i)!=0)
			System.out.print(c.get(i)+"x"+i+" ");
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
         Polynomial d=new Polynomial();
          int n=Math.max(c.degree(),p.c.degree());
         for(int i=0;i<=n;i++){
			d.setCoefficient(i,c.get(i)+p.c.get(i));	
         }
		return d;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
			Polynomial d=new Polynomial();
        
           int n=Math.max(c.degree(),p.c.degree());
         for(int i=0;i<=n;i++){
			d.setCoefficient(i,c.get(i)-p.c.get(i));	
         }
        return d;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial d=new Polynomial();
         int n=c.degree()+p.c.degree()+1;
         for (int i=0;i<=n;i++)
        d.c.add(i, 0);

    for (int i = 0; i <=c.degree(); i++)

        for (int j = 0; j <= p.c.degree(); j++)

            d.setCoefficient(i+j, ((c.get(i) * p.c.get(j))+d.c.get(i+j)));
 
        return d;
	}

}

