package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> ds = new ArrayList<String>();
		
		int option = 0;
		
		do {
			option = Menu(s);
			switch (option) {
			case 1:
				ThemNguoiDung(s,ds);
				break;
			case 2:
				XuatDanhSachNguoiDung(ds);
				break;
			case 3:
				XuatDanhSachNgauNhien(ds);
				break;
			case 4:
				SapXepVaXuatDanhSach(ds);
				break;
			case 5:
				System.out.println(XoaKhoiDanhSach(s, ds));
				break;
			default:
				break;
			}
			
		}while(option != 6);
		
	}
	
	public static int Menu(Scanner s) 
	{
		
		System.out.println("1. Nhap danh sach ho va ten");
		System.out.println("2. Xuat danh sach vua nhap");
		System.out.println("3. Xuat danh sach ngau nhien");
		System.out.println("4. Sap xep giam dan va xuat danh sach");
		System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
		System.out.println("6. Ket thuc");
		System.out.print("*-------------------*");
		
		return Integer.parseInt(s.nextLine());
		
	}
	
	public static void ThemNguoiDung(Scanner s, ArrayList<String> listUser) {
		
		while(true) 
		{
			System.out.println("Nhap ho ten");
			listUser.add(s.nextLine());
			
			System.out.println("Nhap them Y/N");
			if(s.nextLine().equals("N")) {
				break;
			}
		}
		
	}
	
	public static void XuatDanhSachNguoiDung(ArrayList<String> ds) {
		for (int i = 0; i < ds.size(); i++) 
		{
			System.out.println("-------------------------------");
			int stt = i + 1;
			System.out.println(stt + "." + ds.get(i));
		}
		System.out.println("-------------------------------");
	}
	
	public static void XuatDanhSachNgauNhien(ArrayList<String> ds) 
	{
		Collections.shuffle(ds);
		XuatDanhSachNguoiDung(ds);
	}
	
	public static void SapXepVaXuatDanhSach(ArrayList<String> ds) 
	{
		Collections.sort(ds);
		Collections.reverse(ds);
		XuatDanhSachNguoiDung(ds);
	}
	
	public static String XoaKhoiDanhSach(Scanner sc, ArrayList<String> listUser) 
	{
		System.out.println("Nhap ten nguoi can xoa");
		String nameDel = sc.nextLine();
		
		for (int i = 0; i < listUser.size(); i++) 
		{
			if(listUser.get(i).equals(nameDel)) 
			{
				listUser.remove(i);
				return "Xoa thanh cong";
			}
		}
		
		return " Khong tim thay du lieu ";
	}	
}
