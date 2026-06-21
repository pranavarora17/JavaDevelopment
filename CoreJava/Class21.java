abstract class Caro{
    public abstract void drive();
    public void playMusic(){
        System.out.println("play music");
    }
}
class Wagonar extends Caro{
    public void drive(){
        System.out.println("Wagonar is driving");
    }
}
public class Class21 {
    public static void main(String[] args) {
        Caro obj = new Wagonar();
        // obj.drive();
        obj.playMusic();
    }
}
