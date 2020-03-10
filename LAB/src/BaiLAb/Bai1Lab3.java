package BaiLAb;

import java.util.Scanner;

public class Bai1Lab3 {
	public static void main(String[] args)
	{
		//int a,b,c;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nhap a");
		int a = Integer.parseInt(s.nextLine());
		//System.out.println(a);
		
		System.out.println("Nhap b");
		int b = Integer.parseInt(s.nextLine());
		//System.out.println(b);
		
		System.out.println("Nhap c");
		int c = Integer.parseInt(s.nextLine());
		//System.out.println(c);
		
		double delta = Math.pow(b, 2)- 4 * a *c;
		System.out.println(delta);
		System.out.println(Math.sqrt(delta));
//		System.out.println("can delta= "+  Math.sqrt(delta));
		
		if(delta < 0) {
			delta *= -1;
		}

		System.out.println(Math.sqrt(delta));
	}

}
