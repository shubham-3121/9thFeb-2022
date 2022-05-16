package asignment1;

public class Vovel {

	public static void main(String[] args) {
		System.out.println("wovel");
		
		for(char i='a';i<'z';++i) {
		if ( (i=='a')||(i=='e')||(i=='i')||(i=='o')||(i=='u')) {
			
			System.out.print(i+",");
	}
		}
		System.out.println("\n consonent");
		for(char i='a';i<'z';++i) {
			if (! (i=='a')||(i=='e')||(i=='i')||(i=='o')||(i=='u')) {
				
				System.out.print(i+",");
		}
	}
		}}
