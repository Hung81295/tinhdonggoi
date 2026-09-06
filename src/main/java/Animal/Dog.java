package Animal;

public class Dog extends Animal {
private String giong;
public Dog(String ten,int tuoi,String giong){
    super(ten,tuoi);
    this.giong=giong;
}
@Override
    public void keu(){
    System.out.println("Gâu gâu");
}
}
