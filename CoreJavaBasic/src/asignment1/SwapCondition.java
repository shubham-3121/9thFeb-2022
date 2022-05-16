package asignment1;

public class SwapCondition {
	int S=10;
	int A=10;

	public static void main(String[] args) {
	
SwapCondition s1=new SwapCondition();
     double x=s1.S+s1.A;
     double y=s1.A+x*s1.S;
     System.out.println("before");
     System.out.println("print x:"+x);
     System.out.println("print y:"+y);
     
	
     double temp=x;
	    x=y; 
	   y=temp;
     System.out.println("After");
     System.out.println("print x:"+x);
     System.out.println("print y:"+y);
	

}
} 