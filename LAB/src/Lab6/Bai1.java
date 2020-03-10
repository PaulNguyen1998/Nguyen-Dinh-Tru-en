package Lab6;

import java.util.Scanner;

public class Bai1 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String ht = new String();
		System.out.println("Nhap ho va ten sinh vien");
		ht = s.nextLine();
		String ho = ht.toUpperCase().substring(0,ht.indexOf(" "));
		String dem = ht.substring(ht.indexOf(" "),ht.lastIndexOf(" "));
		String ten = ht.toUpperCase().substring(ht.lastIndexOf(" ")+1);
		
		System.out.println("ten:"+ten+"  " + "ho:"+ho+"  "+"Ten dem:" +dem);
	}
}
