package Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3_main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		ArrayList <SinhVienPoly> ds = new ArrayList<SinhVienPoly>();
		int option = 0;
		do
		{
			
			option = Show(s);
			
			switch(option)
			{
				case 1:ThemDSSV(s,ds);
					break;
				case 2:XuatDSSV(ds);
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break;
			}
			
			
		}while(option !=5 );
	}
	
	public static int Show(Scanner s)
	{
		System.out.println("|-------------------------|");
		System.out.println("|1.Nhap danh sach         |");
		System.out.println("|2.Xuat thong tin         |");
		System.out.println("|3.Xuat sinh vien gioi    |");
		System.out.println("|4.Sap xep DS theo diem   |");
		System.out.println("|5.Thoat                  |");
		System.out.println("|-------------------------|");
		
		return Integer.parseInt(s.nextLine());
	}
	
	public static void ThemDSSV(Scanner s,ArrayList<SinhVienPoly>ds)
	{
	
		while(true)
		{
			
				System.out.println("Nhap ten SV");
				String ten = s.nextLine();
				
				System.out.println("Chon nganh");
				System.out.println("IT chon 1");
				System.out.println("Biz chon 2");
				System.out.println("*************");
				
				int nganhhoc = Integer.parseInt(s.nextLine());
				
				
				if(nganhhoc == 1)
				{
					System.out.println("Ban da chon IT");
					System.out.println("Moi nhap diem JAVA");
					double diemJava = Double.parseDouble(s.nextLine());
					
					System.out.println("Moi nhap diem HTML");
					double diemHtml = Double.parseDouble(s.nextLine());
					
					System.out.println("Moi nhap diem CSS");
					double diemCss = Double.parseDouble(s.nextLine());
					
					ds.add(new SinhVienIT(ten,"IT",diemJava,diemHtml,diemCss));
				}
				
				else if(nganhhoc == 2)
				{
					System.out.println("Ban da chon Biz");
					System.out.println("Nhap diem Marketing");
					double diemMarketing = Double.parseDouble(s.nextLine());
					
					System.out.println("Nhap diem Sale");
					double diemSales = Double.parseDouble(s.nextLine());
					
					ds.add(new SinhVienBiz(ten,"Biz",diemMarketing,diemSales));
					
				}
				
				else
					System.out.println("ban da nhap sai");
				
				System.out.println("Ban co muon nhap them Y/N");
				
				if(s.nextLine().equals("N"))
					break;		
		}
	
			
		
		
		
		
	}
	
	public static void XuatDSSV(ArrayList<SinhVienPoly>ds)
	{
		for(int i = 0;i < ds.size();i++)
		{
			ds.get(i).xuat();
		}
	}

	public static void xuatDDSVGioi(ArrayList <SinhVienPoly> ds)
	
	{
		for (int i = 0;i < ds.size();i++)
		{
			if(ds.get(i).getHocLuc().equals("Gioi"))
			{
				ds.get(i).xuat();
			}
		}
	}
	
	public static void SapXepDSSV(ArrayList <SinhVienPoly> ds)
	{
		Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
			
			@Override
			public int compare(SinhVienPoly o1, SinhVienPoly o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getDiem()-o2.getDiem());
			}
		};
		
		Collections.sort(ds, comp);
		XuatDSSV(ds);
	}
}

