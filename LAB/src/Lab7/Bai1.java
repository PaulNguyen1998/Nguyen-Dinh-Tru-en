package Lab7;

public class Bai1 
{
	public float cd;
	public float cr;
	public float getChuVi()
	{
		return (cd+cr)*2;
	}
	
	public float getDienTich()
	{
		return cd*cr;
	}
	
	public void xuat()
	{
		System.out.println("Chieu dai:"+cd+"\t"+"Chieu rong:"+cr+"\t"+"Chu vi"+this.getChuVi()+"\t"+"Dien tich"+this.getDienTich());
	}
	
	Bai1(float cd,float cr)
	{
		this.cd = cd;
		this.cr = cr;
	}
	
	public Bai1(float c)
	{
		
	}
}