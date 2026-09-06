package Bai1;

public class BankAccount {
    private String soTaiKhoan;
    private double soDu;

    BankAccount(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        if (soDu < 0) {
            this.soDu = 0;
        } else {
            this.soDu = soDu;
        }
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void napTien(double soTien) {
        if (soDu > 0) {
            this.soDu = this.soDu + soTien;
            System.out.println("Nạp " + soTien + " vào tài khoản " + this.soTaiKhoan + ". Số dư hiện tại: " + this.soDu);
        }else {
            System.out.println("Nạp tiền thất bại! Số tiền phải lơn hơn 0!");
        }
    }

    public void rutTien(double soTien) {
        if (this.soDu < soTien && soTien > 0) {
            System.out.println("Rút tiền thất bại do số dư thấp hơn số tiền muốn rút, số dư là: " + this.soDu + " và số tiền muốn rút là: " + soTien);
        } else {
            this.soDu = this.soDu - soTien;
            System.out.println("Rút " + soTien + " khỏi tài khoản " + this.soTaiKhoan + ". Số dư hiện tại: " + this.soDu);
        }

    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("0000000", 1000000);
        b1.napTien(20000);
        b1.rutTien(10000000);
        b1.rutTien(20000);
        System.out.println("Số dư cuối cùng của "+b1.getSoTaiKhoan()+" là: "+b1.getSoDu());
    }
}
