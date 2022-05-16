package day11operators;

public class memory {


		static int salary;
		int empId;	
		void display() {
			System.out.println("I am display()...");
		}
		static void print() {
			System.out.println("I am print()...");
		}
		public static void main(String[] args) {
			//access static members---> static variable and method
			System.out.println("static variable salary: "+memory.salary);//0
			memory.print();		
			//access non static members---> non-static variable and method
			memory m1=new memory();
			System.out.println("non-static variable empId: "+m1.empId);//0
			m1.display();		
			//update static member
			memory.salary=25000;
			System.out.println("update static variable salary: "+memory.salary);//25000
			//update non-static member
			m1.empId=205;
			System.out.println("update non-static variable empId: "+m1.empId);//205		
			memory m2=new memory();
			System.out.println("2nd instance non-static variable empId: "+m2.empId);//0
			m2.display();
		


	}

}
