package BaiLAb;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args)
	{
		int dai,rong,chuvi,dientich;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap chieu dai");
		dai = s.nextInt();
		System.out.println("Nhap chieu rong");
		rong = s.nextInt();
		chuvi=(dai+rong)*2;
		dientich=dai*rong;
		System.out.print("Chu vi hinh chu nhat: "+chuvi+"\n"+"dien tich hinh chu nhat la: "+dientich);
	}
}
