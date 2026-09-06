package Product;

public class Product {
    private String tenSanPham;
    private double gia;
    private int soLuongTon;

    Product(String tenSanPham, double gia, int soLuongTon) {
        this.tenSanPham = tenSanPham;
        if (gia < 0) {
            this.gia = 0;
        } else {
            this.gia = gia;
        }
        if (soLuongTon < 0) {
            this.soLuongTon = 0;
        } else {
            this.soLuongTon = soLuongTon;
        }
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public double getSoLuongTon() {
        return soLuongTon;
    }

    public void setGia(double gia) {
        if (gia < 0) {
            System.out.println("Lỗi! Giá phải lớn hơn 0");
            this.gia = 0;
        } else {
            this.gia = gia;
        }
    }

    public void banHang(int soLuong) {
        if (soLuong <= 0 || soLuong > soLuongTon) {
            System.out.println("Số lượng sai! không đủ hàng hoặc số lượng thấp hơn 0");
        } else {
            this.soLuongTon = this.soLuongTon - soLuong;
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Ổi", 15000, 20);
        p.banHang(15);
        p.setGia(16000);
        System.out.println("Số lượng của " + p.getTenSanPham() + " có giá là " + p.getGia() + " có số lượng hiện tại là: " + p.getSoLuongTon());
    }
}
