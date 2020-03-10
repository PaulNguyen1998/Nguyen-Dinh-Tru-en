package Lab7;

public class HV extends Bai1
{
	private float c ;
	public HV (float c)
	{
		super(c);
		this.c = c;
		
		
	}
	
	public void xuat()
	{
		super.xuat();
		System.out.println("canh:"+this.c);
	}
	
}
