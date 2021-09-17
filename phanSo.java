
public class phanSo {
    private int tu, mau;
 
    public phanSo(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTong = new phanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoHieu = new phanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void nhanPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTich = new phanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        phanSo phanSoThuong = new phanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    public static void main(String[] args) {
        phanSo phanSo1=new phanSo(16,3);    // tạo phân số có tử = 16 và mẫu = 4
        phanSo phanSo2=new phanSo(4,8); // tạo phân số có tử = 4 và mẫu = 8
         
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
}