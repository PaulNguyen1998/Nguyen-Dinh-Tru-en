package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<SanPham> SP = new ArrayList<SanPham>();

		int option = 0;

		do {
			option = ShowMenu(s);

			switch (option) {
			case 1:
				ThemSanPham(s,SP);
				break;
			case 2:
				SapXepVaXuatDanhSach(SP);
				break;
			case 3:
				System.out.println(XoaSanPham(s, SP));
				break;
			default:
				break;
			}

		} while (option != 4);

	}

	public static int ShowMenu(Scanner s) {
		System.out.println("1. Nhap danh sach san pham");
		System.out.println("2. Sap xep giam dan theo theo gia");
		System.out.println("3. Xoa san pham");
		System.out.println("4. Ket thuc");
		System.out.println(">.");
		return Integer.parseInt(s.nextLine());
	}

	public static void ThemSanPham(Scanner s, ArrayList<SanPham> SP) {

		while (true) {
			System.out.println("Nhap ten san pham");
			String tenSP = s.nextLine();
			System.out.println("Nhap gia san pham");
			int giaSP = Integer.parseInt(s.nextLine());
			
			SP.add(new SanPham(tenSP,giaSP));
			
			System.out.println("Nhap them Y/N");
			if(s.nextLine().equals("N")) {
				break;
			}
		}
	}
	
	public static void SapXepVaXuatDanhSach(ArrayList<SanPham> listSP) 
	{
		
		Collections.sort(listSP, (SanPham sp1, SanPham sp2) -> 
		{
			return sp1.getGiaSP() > sp2.getGiaSP() ? -1 : 1;
		});
		
		for (int i = 0; i < listSP.size(); i++) 
		{
			System.out.println("----------------");
			System.out.println("Ten san pham :" + listSP.get(i).getTenSP());
			System.out.println("Gia san pham :" + listSP.get(i).getGiaSP());
		}
		System.out.println("----------------");
	}
	
	public static String XoaSanPham(Scanner sc, ArrayList<SanPham> listSP) 
	{
		System.out.println("Nhap ten san pham can xoa: ");
		String name = sc.nextLine();
		
		for (int i = 0; i < listSP.size(); i++) {
			if(name.equals(listSP.get(i).getTenSP())) {
				listSP.remove(i);
				return "Xoa thanh cong";
			}
		}
		return "Xoa khong thanh cong";
	}
}