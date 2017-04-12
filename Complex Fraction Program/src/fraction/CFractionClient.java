/*
 * Nishant Nawathe
 * Block A
 * 9/4/13
 * Fraction Addition and Product Program
 * The program will input in the numerator and denominator for 2 fractions then calculate and
 * output the sum and product of the 2 fractions.
 */
package fraction;

import TerminalIO.KeyboardReader;

public class CFractionClient 
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();
		int num1 = 0, num2 = 0, den1 = 0, den2 = 0, choice = 0, quit = 1;
		int cnum1 = 0, cnum2 = 0, cden1 = 0, cden2 = 0;
		
		while(quit != 0)
		{
			num1 = reader.readInt("Input numerator 1: ");
			den1 = reader.readInt("Input denominator 1: ");
			cnum1 = reader.readInt("Input numerator for 1st complex number: ");	
			cden1 = reader.readInt("Input denominator for 1st complex number: ");
			num2 = reader.readInt("Input numerator 2: ");
			den2 = reader.readInt("Input denominator 2: ");
			cnum2 = reader.readInt("Input numerator for 2nd complex number: ");
			cden2 = reader.readInt("Input numerator for 2nd complex number: ");
			
			CFractionServer fraction1 = new CFractionServer(num1, den1);
			CFractionServer fraction2 = new CFractionServer(num2, den2);
			CFractionServer fraction3 = new CFractionServer((num1 * num2), (den1 * den2));
			CFractionServer fraction4 = new CFractionServer();
			
			choice = reader.readInt("\nDo you want the product(0), sum(1), or both(2)? ");
			
			if(choice == 0)
				System.out.println(fraction3.toString());
			else if(choice == 1)
				System.out.println(fraction4.toString2(num1, num2, den1, den2));
			else if(choice == 2)
				System.out.println(fraction3.toString() + fraction4.toString2(num1, num2, den1, den2));
			
			quit = reader.readInt("\nInput 0 if you wish to quit, else input any other integer: ");
		}
		
		reader.pause();
	}
}
