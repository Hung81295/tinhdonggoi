package Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d=new Dog("Mực",3,"Chó ta");
        Cat c=new Cat("Miu",4,"Cam");
        d.hienThi();
        d.keu();
        c.hienThi();
        c.keu();
    }
}
