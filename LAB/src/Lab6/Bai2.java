package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<ScanPham> sp = new ArrayList<ScanPham>();
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Nhap vao ten SP");
			String tenSP = s.nextLine();
			
			System.out.println("Nhap gia san pham");
			double giaSP =Double.parseDouble(s.nextLine());

			System.out.println("Nhap hang san pham");
			String hangSP = s.nextLine();
			
			sp.add(new ScanPham(tenSP,giaSP,hangSP));
		}
		
		for(int i = 0 ; i > sp.size();i++)
		{
			if(sp.get(i).getHangSP().equals("Nokia"))
			{
				sp.get(i).xuat();
			}
		}
		

	}

}

	
	

	

