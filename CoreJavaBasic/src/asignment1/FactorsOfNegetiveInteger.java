package asignment1;

public class FactorsOfNegetiveInteger {
	

	public static void main(String[] args) {
		int num=-15;
		for(int i=num;i<=Math.abs(15);i++) {
			if(i==0) {
				continue;
				
			}else
			if(num%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
