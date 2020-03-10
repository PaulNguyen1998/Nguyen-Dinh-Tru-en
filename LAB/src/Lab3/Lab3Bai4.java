package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai4 {

	public static void main(String[] args) 
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap so sinh vien");
		n = s.nextInt();
		s.nextLine();
		String[] ten= new String[100];
		int[] diem = new int[100];
		
		
		//nhap
		for (i = 0; i < n ;i++ )
		{
			System.out.println("Hoc sinh thu["+(i+1)+"]:");
			ten[i] = s.nextLine();
			
			System.out.println("Diem hoc sinh thu["+(i+1)+"]:");
			diem[i] = s.nextInt();
			s.nextLine();
	
		}
		//sap xep
		for(i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(diem[i] < diem[j])
				{
					int tam1 = diem[i];
					diem[i] = diem[j];
					diem[j] = tam1;
					
					String tam = ten[i];
					ten[i] = ten[j];
					ten[j] = tam;
				}
			}
		}

	/*xuat*/
		for (i = 0; i < n ;i++ )
		{		
			if(diem[i] < 5)
				System.out.println("hoc sinh thu["+(i+1)+"],"+ten[i]+",diem: "+diem[i]+" Yeu");
			else if(5>=diem[i] && diem[i]<6.5)
				System.out.println("hoc sinh thu["+(i+1)+"],"+ten[i]+",diem: "+diem[i]+" Trung Binh");
			else if(6.5>= diem[i] && diem[i] < 7.5)
				System.out.println("hoc sinh thu["+(i+1)+"],"+ten[i]+",diem: "+diem[i]+" Kha");
			else if (diem[i]>=7.5 && diem[i]<9)
				System.out.println("hoc sinh thu["+(i+1)+"],"+ten[i]+",diem: "+diem[i]+" Gioi");
			else 
				System.out.println("hoc sinh thu["+(i+1)+"],"+ten[i]+",diem: "+diem[i]+" Xuat sac");
		}
	}

}

 