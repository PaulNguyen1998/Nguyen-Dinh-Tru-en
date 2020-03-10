package Assigment_GD1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class menu {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		int option = 0;
		
		do
		{
			option = Show(s);
			
			switch(option)
			{
			
				case 0:
					nhapNVMau(ds);
					break;
				case 1:
					danhSach(s,ds);
					break;
				case 2:
					xuatDS(ds);
					break;
				case 3:
					timNVTheoMaSo(s,ds);
					break;
				case 4:
					xoaNV(s,ds);
					break;
				case 5:
					suaNV(s,ds);
					break;
				case 6:
					timNVTheoLuong(s,ds);
					break;
				case 7:
					sapXepTheoHoTen(s,ds);
					break;
				case 8:
					sapXepTheoThuNhap(ds);
				case 9:
					xuatNVThuNhapCao(ds);
					break;
				default:
					break;
					
				
			}
			
		}while(option != 10);
		
		System.out.println("ket thuc");
		
	}
	
	public static int Show(Scanner s)
	{	
		System.out.println("|*-----------------------------*|"); 
		System.out.println("|*1.Nhap danh sach nhan vien   *|");
		System.out.println("|*2.Xuat danh sach nhan vien   *|");
		System.out.println("|*3.Tim nhan vien theo ma so   *|");
		System.out.println("|*4.Xoa nhan vien theo ma so   *|");
		System.out.println("|*5.Sua nhan vien theo ma so   *|");
		System.out.println("|*6.Tim nhan vien theo luong   *|");
		System.out.println("|*7.sap xep theo ho va ten     *|");
		System.out.println("|*8.Sap xep theo thu nhap      *|");
		System.out.println("|*9.Xuat5 NV thu nhap cao nhat *|");
		System.out.println("|*10.Thoat                     *|");
		System.out.println("|*-----------------------------*|");
		System.out.println("Vui long chon chuc nang.");
		
		return Integer.parseInt(s.nextLine());
	}
	
	public static void nhapNVMau(ArrayList<NhanVien>ds)
	{
		ds.add( new NhanVien("001","Nguyen  C","Nhan vien",1000));
		ds.add( new NhanVien("0011","Nguyen n D","Nhan vien",11000));
		ds.add(new NhanVien("0012","Nguyen vn E","Nhan vien",10200));
		ds.add( new NhanVien("0013","Nguyen vn F","Nhan vien",10030));
		ds.add(new NhanVien("0014","Nguyen vn q","Nhan vien",10040));
		
	}
	
	public static void danhSach(Scanner s,ArrayList<NhanVien>ds)
	{
		while(true)
		{
			String hoTen;
			System.out.println("Nhap ho va ten:");
			hoTen = s.nextLine();
			
			String maNV;
			System.out.println("Nhap ma nhan vien");
			maNV = s.nextLine();
			
			System.out.println("nhap chuc vu");
			System.out.println("Hanh chinh chon 1");
			System.out.println("Truong phong chon 2");
			System.out.println("Tiep thi chon 3");
			System.out.println("*----------------------*");
			
			int chucVu = Integer.parseInt(s.nextLine());
			
			double luong;
			if (chucVu == 1)
			{
				System.out.println("Ban la nhan vien hanh chinh");
				System.out.println("Nhap luong");
				luong = Double.parseDouble(s.nextLine());
				
				ds.add(new NhanVien(maNV,hoTen,"nhan vien hanh chinh",luong));
			}
			
			else if(chucVu == 2)
			{
				System.out.println("Truong phong");
				System.out.println("Nhap luong");
				luong =  Double.parseDouble(s.nextLine());
				
				System.out.println("Nhap luong trach nhiem");
				double trachNhiem = Double.parseDouble(s.nextLine());
				
				ds.add(new TruongPhong(maNV, hoTen,"TruongPhong", luong, trachNhiem));
				
			}
			else if(chucVu == 3)
			{
				System.out.println("Tiep thi");
				System.out.println("Nhap luong");
				luong =  Double.parseDouble(s.nextLine());
				
				System.out.println("nhap doanh so");
				double hueHong = Double.parseDouble(s.nextLine());
				
				System.out.println("Nhap hue hong");
				double doanhSo = Double.parseDouble(s.nextLine());
				
				ds.add(new TiepThi(maNV,hoTen,"Tiep thi",luong,doanhSo,hueHong));
				
			}
			else
				System.out.println("Ban da nhap sai!");
			
			System.out.println("Ban co muon nhap them Y/N");
			
			String yes = s.nextLine();
			if(yes.equals("N"))
				break;
		}
		
	}
	
	public static void xuatDS(ArrayList<NhanVien>ds)
	{
		for(int i = 0; i < ds.size();i++)
		{
			ds.get(i).xuatTT();
		}
	}
	
	public static void timNVTheoMaSo(Scanner s,ArrayList<NhanVien>ds)
	{
		System.out.println("Nhap ma so nhan vien can tim");
		String maMoi = s.nextLine();
		for(int i = 0;i < ds.size();i++)
		{
			if(maMoi.equals(ds.get(i).maNV))
			{
				System.out.println("ban da tim thay\n");
				ds.get(i).xuatTT();
			}
				
			else
				System.out.println("Khong tim thay ket qua");
		}
	}
	
	public static String xoaNV(Scanner s, ArrayList<NhanVien>ds)
	{
		System.out.println("Nhap ma nhan vien can xoa");
		String xoaNV = s.nextLine();
		
		for(int i = 0;i < ds.size();i++ )
		{
			if(xoaNV.equals(ds.get(i).maNV))
			{
				ds.remove(i);
				return "xoa thanh cong";
			}
		}
		
		return "Xoa khong thanh cong";
	}
	
	public static void suaNV(Scanner s, ArrayList<NhanVien>ds)
	{
		System.out.println("Nhap ma so nhan vien");
		String newMSNV = s.nextLine();
		
		for(int i = 0;i < ds.size();i++)
		{
			if(newMSNV.equals(ds.get(i).maNV))
			{
				System.out.println("Trung khop");
				
				String hoTen;
				System.out.println("Nhap ho va ten:");
				hoTen = s.nextLine();
				
				
				System.out.println("nhap chuc vu");
				System.out.println("Hanh chinh chon 1");
				System.out.println("Truong phong chon 2");
				System.out.println("Tiep thi chon 3");
				System.out.println("*----------------------*");
				
				int chucVu = Integer.parseInt(s.nextLine());
				
				double luong;
				if (chucVu == 1)
				{
					System.out.println("Ban la nhan vien hanh chinh");
					System.out.println("Nhap luong");
					luong = Double.parseDouble(s.nextLine());
					
					ds.add(new NhanVien(ds.get(i).maNV,hoTen,"nhan vien hanh chinh",luong));
				}
				
				else if(chucVu == 2)
				{
					System.out.println("Truong phong");
					System.out.println("Nhap luong");
					luong =  Double.parseDouble(s.nextLine());
					
					System.out.println("Nhap luong trach nhiem");
					double trachNhiem = Double.parseDouble(s.nextLine());
					
					ds.add(new TruongPhong(ds.get(i).maNV, hoTen,"TruongPhong", luong, trachNhiem));
					
				}
				else if(chucVu == 3)
				{
					System.out.println("Tiep thi");
					System.out.println("Nhap luong");
					luong =  Double.parseDouble(s.nextLine());
					
					System.out.println("nhap doanh so");
					double hueHong = Double.parseDouble(s.nextLine());
					
					System.out.println("Nhap hue hong");
					double doanhSo = Double.parseDouble(s.nextLine());
					
					ds.add(new TiepThi(ds.get(i).maNV,hoTen,"Tiep thi",luong,doanhSo,hueHong));
					
				}
				else
					System.out.println("Ban da nhap sai!");
				
				ds.set(i, ds.get(i).maNV);
				ds.get(i).xuatTT();
				break;
			}
			
			else
				System.out.println("Khong tim tay ket qua");
				break;
			
			
		}
		
	}
	
	public static void timNVTheoLuong(Scanner s,ArrayList<NhanVien>ds)
	{
		System.out.println("Nhap tien luong thap nhat");
		double NVluongMin = Double.parseDouble(s.nextLine()); 
		
		System.out.println("Nhap tien luong cao nhat");
		double NVluongMax = Double.parseDouble(s.nextLine()); 

		int num = 0;
		for(int i = 0;i < ds.size();i++)
		{
			NhanVien nv = ds.get(i);
			if(nv.luong < NVluongMax && nv.luong > NVluongMin)
			{
				nv.xuatTT();
				num++;
			}
		}
		System.out.println("Tong so nhan vien tim thay:"+num);
	}
	
	public static void sapXepTheoHoTen(Scanner s,ArrayList<NhanVien>ds)
	{
		Comparator<NhanVien> comparator = new Comparator<NhanVien>() 
		{
			
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return o1.hoTen.compareTo(o2.hoTen);
			}
		};
		
		Collections.sort(ds, comparator);
		xuatDS(ds);
	}
	
	public static void sapXepTheoThuNhap(ArrayList<NhanVien>ds)
	{
		Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
			
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getThuNhap()-o2.getThuNhap());
			}
		};
		
		Collections.sort(ds,comparator);
		xuatDS(ds);
	}
	
	public static void xuatNVThuNhapCao(ArrayList<NhanVien>ds)
	{
		Comparator<NhanVien> comparator = new Comparator<NhanVien>() 
		{
			
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return (int)(o2.getThuNhap()-o1.getThuNhap());
			}
		};
		
		Collections.sort(ds,comparator);
		
		for(int i = 0; i < 5;i++)
		{
			ds.get(i).xuatTT();
		}
	}
}
