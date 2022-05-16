package day14condition;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SwitchCase1 {

	public static void main(String[] args) {
		int month='c';
         switch (month) {
         case 'b':
        	 System.out.println("This month is Jan");
        break;
         case 'c':
        	 System.out.println("This month is Feb");
        break;
        default :
        	System.out.println("This is invalid month");
        break;
         
         }
	}

}
