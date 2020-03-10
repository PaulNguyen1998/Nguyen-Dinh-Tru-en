package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Double> ds = new ArrayList<Double>();
		
		while (true) 
		{
			ds.add(Double.parseDouble(s.nextLine()));
			System.out.println("Nhap them Y / N");
			if(s.nextLine().equals("N")) 
			{
				break;
			}
		}
		
		
		double res = 0;
		
		for (int i = 0; i < ds.size(); i++) 
		{
			double num = ds.get(i);
			System.out.println(num);
			res += num;
		}
		
		System.out.println(res);
	}
}
