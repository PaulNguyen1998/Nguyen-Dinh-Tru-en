package Assigment_GD1;

public class TiepThi extends NhanVien 
{
	double danhSo;
	double hueHong;
	
	TiepThi(String maNV,String hoTen,String chucVu,double luong,double doanhSo,double hueHong)
	{
		super(maNV,hoTen,chucVu,luong);
		this.danhSo = doanhSo;
		this.hueHong = hueHong;
	}
	
	double getThuNhap()
	{
		return super.getThuNhap()+this.danhSo*hueHong;
	}
}
