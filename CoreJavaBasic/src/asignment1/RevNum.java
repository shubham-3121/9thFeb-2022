package asignment1;

public class RevNum {

	public static void main(String[] args) {
	int num=123,rev=0,rem=0;
	while(num!=0) {
		rem=num%10;//123%10=3 ---> 12%10=2  ----> 1%10=1
		rev=rev*10+rem;//10*0+3=3 --->3*10+2=32 ---->32*10+1=321
		num=num/10;//123/10=12 ---->12/10=1  -->1/10=0
	}
	System.out.println("Reverse Number: "+rev);
	//System.out.println("Reverse Number using method: "+getReverseNumber(12345));
	
	}

	}


