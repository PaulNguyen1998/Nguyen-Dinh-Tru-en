package Lab4;

import java.util.Scanner;

public class SanPham3
{
	String tenSP;
	double donGia;
	double giamGia;
	
	public SanPham3(String tenSP,double donGia,double giamGia)
	{
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham3(String tenSP,double donGia)
	{
		this.tenSP = tenSP;
		this.donGia = donGia;
	}

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
	
	
	private double getThueNhapKhau()
	{	
		return  donGia*0.1;
	}
	
	public void xuat()
	{
		System.out.println("Ten san pham"+tenSP);
		System.out.println("Don gia:"+donGia);
		System.out.println("Giam gia:"+giamGia);
		System.out.println("Thue nhap khau:"+getThueNhapKhau());
	}
	public  void main(String[] args)
	{
		
		SanPham3 sp = new SanPham3("SoNy", 10);
		SanPham3 sp2 = new SanPham3("Apple",20,2);
		
		
		
	}
	
}

