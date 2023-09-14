package Javaptit.J05036;

public class QuanLy {
    private String ma,tenHang,doiVi;
    private long giaNhap,soLuong;
    private int cnt = 1;

    public QuanLy(String ma,String tenHang, String doiVi, long giaNhap, long soLuong) {
        this.ma = ma;
        this.tenHang = tenHang;
        this.doiVi = doiVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    private long giaVanChuyen(){
        return (long) Math.round ((1.0 * (giaNhap * soLuong) * 5 )/ 100 );
    }
    private long thanhTien(){
        return (long) Math.round ((1.0 *(giaNhap*soLuong) + giaVanChuyen()));
    }

    public long giaBan(){
        return thanhTien()+(long) Math.round((1.0*(thanhTien()*2))/100);
    }
    public long getGiaVanChuyen() {
        return giaVanChuyen();
    }

    public long getThanhTien() {
        return thanhTien();
    }
    public String toString() {
        return ma + " " + tenHang + " " + doiVi + " " + getGiaVanChuyen() + " " + getThanhTien() + " " + giaBan();
    }
}

