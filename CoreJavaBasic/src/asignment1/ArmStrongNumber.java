package asignment1;

public class ArmStrongNumber {

	public static void main(String[] args) {
//		int num =1564, rem=0,rev=0;
//		while (num!=0) {
//			rem =num%10;
//			rev=rem+rev*10;
//			num=num/10;
//			
//		}
//		System.out.println("reverse number is : "+rev);
		
		int rev=0,rem=0;	
			for (int i = 4879;i>0;i=i%10) {
//				rem=i%10;
				rev=rev*10+i;
				i=i/10;
			}
			System.out.println("sdfnjff "+rev);
		}
	 
	
	}
		
