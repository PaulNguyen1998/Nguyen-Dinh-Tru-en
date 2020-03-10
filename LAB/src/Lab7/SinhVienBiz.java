package Lab7;

public  class SinhVienBiz extends SinhVienPoly
{
	SinhVienBiz(String ten,String nganh,double diemMarketing,double diemSales) {
		super(ten,nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
		// TODO Auto-generated constructor stub
	}
	double diemMarketing;
	double diemSales;
	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (2*diemMarketing +diemSales )/3;
	}
	
	
	
	
}
