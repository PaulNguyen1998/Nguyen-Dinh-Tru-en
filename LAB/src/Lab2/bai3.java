package Lab2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args)
	{
		int tiendien,tong;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap so  dien su dung: ");
		tiendien = s.nextInt();
		if (tiendien <= 50)
		{
			tong=tiendien*1000;
			System.out.println("so tien dien: "+tong+" d");
		}
		else
		{
			tong =50*tiendien+(tiendien-50)+1200;
			System.out.println("so tien dien: "+tong+" d");
		}
			
		
	}

}
