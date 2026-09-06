package Animal;

public class Animal {
    protected  String ten;
    protected int tuoi;
    Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public void keu(){
        System.out.println("Con vật này kêu ");
    }
    public void hienThi(){
        System.out.println("Bạn này tên là "+this.ten+" mới "+this.tuoi+" tuổi");
    }
}
