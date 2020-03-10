package Lab4;

import java.util.Scanner;

public class SanPham 
{
	public String tenSP;
	double donGia;
	double giamGia;

	void nhap()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("nhap ten san pham:");
		tenSP = s.nextLine();
		System.out.println("Nhap don gia");
		donGia = s.nextDouble();
		System.out.println("nhap giam gia");
		giamGia = s.nextDouble();
	}
	
	
	double getThueNhapKhau()
	{	
		return donGia*0.1;
	}
	
	void xuat()
	{
		System.out.println("Ten san pham"+tenSP);		System.out.println("Don gia:"+donGia);
		System.out.println("Giam gia:"+giamGia);
		System.out.println("Thue nhap khau"+getThueNhapKhau());
	}
	public static void main(String[] args)
	{
		SanPham sp = new SanPham();
		sp.nhap();
		sp.xuat();
		
		SanPham sp2 = new SanPham();
		sp2.nhap();
		sp2.xuat();
	}
	
}

