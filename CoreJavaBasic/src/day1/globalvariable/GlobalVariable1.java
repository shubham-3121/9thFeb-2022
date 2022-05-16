package day1.globalvariable;

public class GlobalVariable1 {
	int age=24;
	char shub='s';
	double phone=9823;
	
	public static void main(String[] args) {
		GlobalVariable1 a1=new GlobalVariable1();
	System.out.println("age:\t"+a1.age);
	//creat object to declaire non static global variable 
	System.out.println("Phone:\t"+a1.phone);
	System.out.println("name:\t"+a1.shub);
	
	}
}
