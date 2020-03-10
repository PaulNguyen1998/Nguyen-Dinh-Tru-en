package Lab2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap a");
		a = s.nextInt();
		System.out.println("nhap b");
		b = s.nextInt();
		System.out.println("nhap b");
		c = s.nextInt();
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
	}

}
