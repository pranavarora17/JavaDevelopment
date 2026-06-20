class Lapi extends Object{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

}
public class Class18{
    public static void main(String[] args) {
        Lapi obj = new Lapi();
        obj.model="Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj.toString());
    }
}