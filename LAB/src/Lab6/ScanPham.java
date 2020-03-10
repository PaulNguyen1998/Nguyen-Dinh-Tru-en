package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanPham 
{
	String ten;
	double donGia;
	String hang;
	
	public ScanPham(String ten,double donGia,String hang)
	{
		this.ten = ten;
		this.donGia = donGia;
		this.hang = hang;
	}
	
	public void xuat()
	{
		System.out.println("Ten SP:"+ten+"\t" +"Don gia:"+donGia+"\t"+"Hang:"+hang);
	}
	
	public String getHangSP()
	{
		return this.hang;
	}
	

}
