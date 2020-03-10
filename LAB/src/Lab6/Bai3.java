package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 
{
	public static void main(String[] args)
	{
		ArrayList <Bai3SV> ds = new ArrayList<Bai3SV>();
		Scanner s = new Scanner(System.in);
		
		String SDTprtn = "0\\d{9,10}"; 
		String CMNDprtn = "[0-9] {9}";
		String emailprtn = "\\w+@\\w+(\\.\\w){1,2}";
		
		for ( int i = 0 ; i < 2 ; i++)
		{
			System.out.println("nhap ten SV thu "+i+1+":");
			String ten =s.nextLine();
			System.out.println(ds.get(i).SDT);
			
			System.out.println("Nhap SDT:");
			String SDT = (s.nextLine());
			
			System.out.println("Nhap so CMND");
			String CMND = s.nextLine();
			
			System.out.println("nhap Email");
			String eMail = s.nextLine();
			
			ds.add(new Bai3SV(ten,SDT,CMND,eMail));
		}
		
		
		
		for(int i = 0 ;i <ds.size();i++)
		{
			if(ds.get(i).getSDT().matches(SDTprtn))
			{
				System.out.println("Nhap dung SDT");
				
			}
			else
				System.out.println("nhap tam bay");
			
			if(ds.get(i).getCMND().matches(CMNDprtn))
			{
				System.out.println("Nhap dung CMND");
				System.out.println(ds.get(i).CMND);
			}
			else
				System.out.println("nhap tam bay");
			
			if(ds.get(i).getSDT().matches(emailprtn))
			{
				System.out.println("Nhap dung Email");
				System.out.println(ds.get(i).eMail);
			}
			else
				System.out.println("nhap tam bay");
		}
		
	}
}
