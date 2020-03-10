package Lab2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args){
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap a");
		a = s.nextInt();
		System.out.println("nhap b");
		b = s.nextInt();
		
		if(a == 0)
		{
			System.out.println("Nghiem phuuong trinh = "+b);
				
		}
		else if(a == 0)
			System.out.println("Ngiem phuong trinh vo nghiem");
		else
				System.out.println("Ngiem phuong trinh = "+-b/a);
	}
}

