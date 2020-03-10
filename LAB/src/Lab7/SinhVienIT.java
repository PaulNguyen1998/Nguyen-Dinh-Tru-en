package Lab7;

public class SinhVienIT extends SinhVienPoly
{
	double diemJaVa;
	double diemCss;
	double diemHtml;

	SinhVienIT(String ten,String nganh,double diemJaVa,double diemHtml,double diemCss)
	{
		
		// TODO Auto-generated constructor stub
		super(ten,nganh);
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
		this.diemJaVa = diemJaVa;
		
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (diemJaVa*2+ diemHtml +diemCss)/4;
	}

}
