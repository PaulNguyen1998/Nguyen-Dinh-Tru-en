package Lab8;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		XPoly so = new XPoly();
		double a [] = new double [] {1,2,34,4};
		System.out.println("tong:"+so.sum(a));
		System.out.println("So be nhat:"+so.XPolyMin(a));
		System.out.println("so lon nhat:"+so.XPolyMax(a));
		
		System.out.println("Nhap ten:");
		String str = s.nextLine();
		System.out.println(so.toUpperFirstChar(str));
	}
}
