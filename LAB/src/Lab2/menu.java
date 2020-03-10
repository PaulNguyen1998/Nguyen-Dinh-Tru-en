package Lab2;

import java.util.Scanner;

public class menu 
{
	public static void main(String[] args)
	{
		System.out.println("++----------------------------++");
		System.out.println("+             MENU             +");
		System.out.println("+ 1.Phuong trinh bac 1         +");
		System.out.println("+ 2.Phuong trinh bac 2         +");
		System.out.println("+ 3.Tinh tien dien             +");
		System.out.println("+                              +");
		System.out.println("+ moi chon noi dung theo so    +");
		System.out.println("+                              +");
		System.out.println("+******************************+");
		int x;
		Scanner s=new Scanner(System.in);
		x = s.nextInt();
		switch(x)
		{
			case 1:
			{
				int a,b;
				Scanner s1 = new Scanner(System.in);
				System.out.println("nhap a");
				a = s1.nextInt();
				System.out.println("nhap b");
				b = s1.nextInt();
				
				if(a == 0)
				{
					System.out.println("Nghiem phuuong trinh = "+b);
						
				}
				else if(a == 0)
					System.out.println("Ngiem phuong trinh vo nghiem");
					else
						System.out.println("Ngiem phuong trinh = "+-b/a);
				break;
			}
			
			case 2:
			{
				int a,b,c;
				Scanner s1 = new Scanner(System.in);
				System.out.println("nhap a");
				a = s1.nextInt();
				System.out.println("nhap b");
				b = s1.nextInt();
				System.out.println("nhap b");
				c = s1.nextInt();
				if (a == 0)
				{
					System.out.println("ngiem phuong trinh: "+-c/b);
				}
				else
				{
					float delta=b*b-4*a*c;
					
					if(delta < 0)
						System.out.println("phuong trinh vo nghiem");
					else if(delta == 0)
						System.out.println("Ngiem kep: "+-b/(2*a));
					else
						System.out.println("phuong trinh co hai ngiem phan biet \n"+"x1= "+(-b+	Math.sqrt((double)delta))/2*a +"  "+"x2= "+ (-b+	Math.sqrt((double)delta))/2*a);
				}
				break;
			}
			
			case 3:
			{
				int tiendien,tong;
				Scanner s1 = new Scanner(System.in);
				System.out.println("nhap so  dien su dung: ");
				tiendien = s1.nextInt();
				if (tiendien <= 50)
				{
					tong=tiendien*1000;
					System.out.println("so tien dien: "+tong+" d");
				}
				else
				{
					tong =50*tiendien+(tiendien-50)+1200;
					System.out.println("so tien dien: "+tong+" d");
				}
				break;
			}
			default: System.out.println("ban da nhap sai vui long nhap lai");
		}
	
	}

	private static void bac1() {
		// TODO Auto-generated method stub
		
	}

}

