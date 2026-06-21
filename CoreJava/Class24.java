interface ABN{
    int hen = 44;
    String area = "Mumbai"; // final and static
    void show();
    void config();
}
interface CBP extends ABN{
    void run();
}
class Min implements ABN,CBP{
    public void show(){
        System.out.println("Show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("Running");
    }
}
public class Class24 {
    public static void main(String[] args) {
        Min obj = new Min();
        obj.config();
        obj.show();
        System.out.println(ABN.area);
    }
}
