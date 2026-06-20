class BEN{
    public void show1(){
        System.out.println("In a show");
    }
}
class TEN extends BEN{
    public void show2(){
        System.out.println("In b show");
    }
}
public class Class19 {
    public static void main(String[] args) {
//        double d = 4.5;
//        int i = (int)d;
//        System.out.println(i);

        BEN obj = (BEN)new TEN(); // Upcasting

        TEN obj1 = (TEN)obj;  // Downcasting
    }
}
