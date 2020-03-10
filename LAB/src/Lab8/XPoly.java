package Lab8;

public  final class XPoly 
{
	public static final double sum(double ...x)
	{
		double s = 0;
		for(double a : x)
		{
			s += a;
		}
		
		return s;
	}
	
	public static final double XPolyMin(double ...x)
	{
		double min = 0;
		 min = x[0] ;
		for(int i = 0; i < x.length;i++)
		{
			
			if(min > x[i])
				min = x[i];
			
		}
		return min;
		
	}
	
	public static final double XPolyMax(double ...x)
	{
		double max = 0;
		max = x[0];
		for(int i = 0;i<x.length;i++)
		{
			if(max < x[i])
				max = x[i];
		}
		return max;
	}
	
	public static final String toUpperFirstChar(String ten)
	{
		String[] words = ten.split(" ");
		for(int i = 0 ; i < ten.length();i++)
		{
			char ktDau = words[i].charAt(0);
			
			String hoaKTD = String.valueOf(ktDau).toUpperCase();
			
			words[i] = hoaKTD + words[i].substring(1);
		}
		
		String ss = String.join(" ", words);
		return ss;
	}
}
