package Lab6;

public class Bai3SV 
{
	String tenSV;
	String SDT;
	String CMND;
	String eMail;
	
	public Bai3SV(String tenSV ,String SDT ,String CMND,String eMail)
	{
		this.tenSV = tenSV;
		this.SDT = SDT;
		this.CMND = CMND;
		this.eMail = eMail;
	}
	
	public void xuat()
	{
		System.out.println("Ten: "+tenSV+"\t" + "SDT: "+SDT+"\t"+"So CMND"+CMND+"\t"+"Email:"+eMail);
		
	}
	
	public String getSDT()
	{
		return this.SDT;
	}
	
	public String getCMND()
	{
		return this.CMND;
	}
	
	public String getEmail()
	{
		return this.eMail;
	}
}
