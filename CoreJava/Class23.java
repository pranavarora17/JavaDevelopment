class Bun{
    public void show(){
        System.out.println("In A show");
    }

}
public class Class23 {
    public static void main(String[] args) {
        Bun obj = new Bun(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();

    }
}
