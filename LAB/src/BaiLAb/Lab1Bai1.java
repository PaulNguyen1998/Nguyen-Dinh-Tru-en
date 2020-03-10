package BaiLAb;

import java.util.Scanner;


public class Lab1Bai1 {
	public static void main(String[] args)
	{
		float diemTB;
		String hoTen;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ho va ten: ");
			hoTen = scanner.nextLine();
			System.out.print("DiemTB: ");
			diemTB = scanner.nextFloat();
		}
		System.out.print("Ho va ten: "+hoTen+"\n"+"DiemTB: "+diemTB+"\n");
		
		
		}

}
