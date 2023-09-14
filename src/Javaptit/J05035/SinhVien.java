package Javaptit.J05035;

public class SinhVien {
    private String ma,ten,lop,email,doanhNgiep;
    private int stt;

    public SinhVien(int stt,String ma, String ten, String lop, String email, String doanhNgiep) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNgiep = doanhNgiep;
    }

    public String getMa() {
        return ma;
    }

    public String getDoanhNgiep() {
        return doanhNgiep;
    }

    @Override
    public String toString() {
        return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+doanhNgiep;
    }
}
