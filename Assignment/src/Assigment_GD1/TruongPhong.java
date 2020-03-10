package Assigment_GD1;

public class TruongPhong extends NhanVien
{
	double trachNhiem;
	
	double getThuNhap()
	{
		return super.getThuNhap() + this.trachNhiem;
	}
	
	public TruongPhong(String maNV,String hoTen, String chucVu,double luong,double trachNhiem)
	{
		super(maNV,hoTen,chucVu,luong);
		this.trachNhiem = trachNhiem;
		
	}
	
	
}
