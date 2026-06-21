class Are{
    public void showTheData(){
        System.out.println("Hey I am normal data");
    }
}
class You extends Are{
    @Override
    public void showTheData(){
        System.out.println("I am overriden data ok");
    }
}
public class Class28 {
    public static void main(String[] args) {
        You obj = new You();
        obj.showTheData();
    }
}
