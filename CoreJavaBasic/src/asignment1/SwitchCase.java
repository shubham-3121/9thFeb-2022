package asignment1;

public class SwitchCase {

	public static void main(String[] args) {
		int sub1=50,sub2=20,res;
		char op='+';
		switch (op) {
		case '+':
			res=sub1+sub2;
			System.out.println("addiition of two numbers:"+res);
			break;
		
		case '-':
			res=sub1-sub2;
			System.out.println("subtraction of two number:"+res);
			break;
		case '/':
			res=sub1/sub2;
			System.out.println("division of two number:"+res);
			break;
		case '*':
			res=sub1*sub2;
			System.out.println("Multification of two number:"+res);
			break;
			
	        default:
			System.out.println("the using data is invalid");
			break;
	
		}
		
		
			
	
	}

}
