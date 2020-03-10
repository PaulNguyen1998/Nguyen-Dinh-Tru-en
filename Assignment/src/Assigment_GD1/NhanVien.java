package Assigment_GD1;

public class NhanVien 
{
	String maNV;
	String hoTen;
	double luong;
	String chucVu;
	
	NhanVien(String maNV,String hoTen,String chucvu,double luong)
	{
		this.hoTen = hoTen;
		this.maNV = maNV;	
		this.chucVu = chucVu;
		this.luong = luong;
		
	}
	
	
	double getThuNhap()
	{
		return luong;
	}
	
	double getThueTN()
	{
		double thue;
		if(luong < 9000)
			 thue = 0;
		else if(luong >= 9000 && luong <= 15000)
			thue  = luong*0.1;
		else 
			thue = luong*0.12;
		return thue;
	}
	
	void xuatTT()
	{
		System.out.println("Ma nhan vien:"+maNV+"\t"+"Ho va ten:"+hoTen+"\t"+"chuc vu:"+chucVu+"\t"+"luong:"+this.getThuNhap()+"\t"+"Thue thu nhap:"+getThueTN());
	}
	
	
}
