class Human{
    private int age;
    private String name;

    public Human(){
        //System.out.println("In constructor");
        age = 12;
        name = "John";
    }
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

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
        Human obj = new Human(5,"HEY");


       // System.out.println(obj.name);
        System.out.println(obj.getAge()+ " :  "+ obj.getName());
    }
}