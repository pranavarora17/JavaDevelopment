class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
}
public class Class10{
    public static void main(String[] args) {
        Human obj = new Human();


       // System.out.println(obj.name);
        System.out.println(obj.getAge()+ " :  "+ obj.getName());
    }
}