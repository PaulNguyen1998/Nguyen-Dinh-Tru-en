package Lab4;

import java.util.Scanner;

public class SanPham2 
{
	String tenSP;
	int gia;

	void nhap()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ten SP");
		tenSP = s.nextLine();
		System.out.println("nhap gia SP");
		gia = s.nextInt();
		
	}
	
	void xuat()
	{
		System.out.println("Ten SP: "+tenSP);
		System.out.println("Gia:"+gia);
	}
	
	public void main(String[] args)
	{
		SanPham2 sp = new SanPham2();
		SanPham2 sp1 = new SanPham2();
		sp.nhap();
		sp.xuat();
		sp1.nhap();
		sp1.xuat();
	}
}

