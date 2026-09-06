package Animal;

public class Cat extends Animal{
    private String mauLong;
    public  Cat(String ten,int tuoi,String mauLong){
        super(ten,tuoi);
        this.mauLong=mauLong;
    }
    @Override
    public void keu(){
        System.out.println("Meo meo");
    }
}
