	package Lab3;

	import java.util.Scanner;

	public class Bai1 {

		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			int i ,n;
			boolean ok = true;
			System.out.println("nhap so can tinh: ");
			n = s.nextInt();
			for (i = 2 ;i < n - 1;i++)
			{
				if(n % i == 0 )
				{
					ok = false;
					break;
				}
			}
			if( ok == true)
				System.out.printf("%d la so nguyen to",n);
			else
				System.out.printf("%d khong phai la so nguyen to",n);
			
		}

	}


