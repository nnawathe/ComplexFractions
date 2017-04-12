package fraction;

public class CFractionServer 
{
	private int numerator, denominator;
	
public CFractionServer()
{
	numerator = 1;
	denominator = 1;
}

public CFractionServer(int num, int den)
{
	numerator = num;
	denominator = den;
	
}

private int calcGCF()
{
	int gcf = 1;
	
	if(numerator > denominator)
		for(int count = numerator; count > 1; count --)
		{
			if(numerator % count == 0 && denominator % count == 0)
				{
					gcf = count;
					break;
				}
		}
	else
		for(int count = denominator; count > 1; count --)
		{
			if(denominator % count == 0 && numerator % count == 0)
				{
					gcf = count;
					break;
				}
		}
	return gcf;
}

public int addFractions(int num1, int num2, int den1, int den2)
{
	int sum = 0;
	
	sum = num1 * (calcLCM(den1, den2) /  den1) + num2 *  (calcLCM(den1, den2) / den2);
	
	return sum;
}

private int calcLCM(int den1, int den2)
{
	int lcm = 1;
	
	if(den1 > den2)
		for(int count = den2; count > 1; count ++)
		{
			if((count % den1 == 0) && (count % den2 == 0))
				{
					lcm = count;
					break;
				}
		}
	else if(den1 == den2)
		lcm = den1;
	else
		for(int count = den1; count > 1; count ++)
		{
			if((count % den1 == 0) && (count % den2 == 0))
				{
					lcm = count;
					break;
				}
		}
	return lcm;
}

public String toString()
{
	String str = "The product of the two fractions is: ";
	
	if(numerator == 0)
		str = str + "0";
	else if(denominator == 0)
		str = str + "undefined (division by zero)";
	else if(denominator == 1)
		str = str + (numerator / calcGCF()) + "";
	else
		str = str + (numerator / calcGCF()) + "/" + (denominator / calcGCF());
	
	return str;
}

public String toString2(int num1, int num2, int den1, int den2)
{
	String str = "\nThe sum of the two fractions is: ";
	
	if(den1 == 0 || den2 == 0)
		str = str + "undefined";
	else
		str = str + addFractions(num1, num2, den1, den2) + "/" + calcLCM(den1, den2);
	
	return str;
}

public int subtractFraction(int num1, int num2, int den1, int den2)
{
	int diff = 0;
	
	diff = num1 * (calcLCM(den1, den2) /  den1) - num2 *  (calcLCM(den1, den2) / den2);
	
	return diff;
}

}
