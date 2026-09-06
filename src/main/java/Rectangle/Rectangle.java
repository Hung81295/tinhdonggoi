package Rectangle;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;

    Rectangle(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Chiều dài hoặc chiều rộng không thể nhỏ hơn hoặc bằng 0");
            this.chieuDai = 1;
            this.chieuRong = 1;
        } else {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) {
            System.out.println("Chiều dài không thể nhỏ hơn hoặc bằng 0");
        } else {
            this.chieuDai = chieuDai;
        }
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0) {
            System.out.println("Chiều rộng không thể nhỏ hơn hoặc bằng 0");
        } else {
            this.chieuRong = chieuRong;
        }
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public void soSanhDienTich(Rectangle other) {
        double dienTichCuaMinh = this.tinhDienTich();
        double dienTichCuaOther = other.tinhDienTich();
        if (dienTichCuaMinh > dienTichCuaOther) {
            System.out.println("Hình chữ nhật hiện tại lớn hơn");
        } else if (dienTichCuaMinh == dienTichCuaOther) {
            System.out.println("Hai hình chữ nhật có diện tích bằng nhau");
        } else {
            System.out.println("Hình chữ nhật other có diện tích lớn hơn");
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(6, 2);
        System.out.println("r1 có chiều dài " + r1.getChieuDai() + " chiều rộng " + r1.getChieuRong() + " có chu vi " + r1.tinhChuVi() + " có diện tích " + r1.tinhDienTich());
        System.out.println("r2 có chiều dài " + r2.getChieuDai() + " chiều rộng " + r2.getChieuRong() + " có chu vi " + r2.tinhChuVi() + " có diện tích " + r2.tinhDienTich());
        r1.setChieuDai(-6);
        r1.setChieuDai(10);
        System.out.println("Sau khi r1 đổi chiều dài thì chiều dài của r1 là: " + r1.getChieuDai());
        r1.soSanhDienTich(r2);
    }
}
