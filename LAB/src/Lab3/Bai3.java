package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 
{
	public static void main(String[] args)
	{
		//nhap&sapxep
		int n,i;
		Scanner s =  new Scanner(System.in);
		System.out.println("Moi nhap so phan tu");
		int[] a = new int[100];
		n = s.nextInt();
		
		for (i = 0;i < n;i++)
		{
			System.out.printf("Phan thu thu[%d]:",i+1);
			a[i] = s.nextInt();	
		}
		
		int arr[] = Arrays.copyOf(a, n);
		Arrays.sort(arr);
		System.out.println("sau khi sap xep");
		System.out.println(Arrays.toString(arr));
		
		//gia tri nho nhat
		int min = a[0];
		for (i = 0 ;i < n; i++) 
		{
			if(a[i] < min)
				min = a[i];
		}
			System.out.println("Gia tri nho nhat trong chuoi:"+min);
			
		//trung binh chia het cho 3
		float ave,sum=0;
		int count= 0;
		for (i = 0 ;i < n; i++)
		{
			if ( a[i] % 3 == 0)
			{
				sum+=a[i];
				count=i++;
			}
		}
		ave=sum/count;
		System.out.println("Trung binh cac so chia het cho 3: "+ave);
	}
	
}
