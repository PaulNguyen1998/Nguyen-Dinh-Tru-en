package Lab7;

public abstract class SinhVienPoly 
{
	String ten;
	String nganh;
	
	SinhVienPoly(String ten, String nganh)
	{
		this.ten = ten;
		this.nganh = nganh;
	}
	
	abstract double getDiem();
	
	String getHocLuc()
	{
		String hocluc = "";
		if (this.getDiem() < 5)
			 hocluc = "Yeu";
		else if(this.getDiem() >= 5 && this.getDiem() <=6 )
			hocluc="TB";
		else if(this.getDiem() >=6.5 && this.getDiem()<=8 )
			hocluc ="KHa";
		else
			hocluc = "Gioi";
		
		return hocluc;
		
	}
	
	void xuat()
	{
		System.out.println("Ho ten:"+ten+"\t"+"Nganh:"+nganh+"\t"+"diem:"+getDiem()+"\t"+"Hoc Luc:"+this.getHocLuc());
	}
}
