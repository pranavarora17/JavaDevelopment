class C{
    public C() {
       // System.out.println("In C");
    }
    public C(int n){
       // System.out.println("In C int");
    }
    public void show(){
        System.out.println("Inside C show method");
    }
    public void config(){
        System.out.println("In C config");
    }
}
class D extends C{
    public D() {
        //System.out.println("In D");
    }
    public D(int n){
        //this();
        //System.out.println("In D int");
    }
    public void show(){
        System.out.println("In D show");
    }

}
public class Class14{
    public static void main(String[] args) {
      D obj = new D();
      obj.show();
      obj.config();
    }
}