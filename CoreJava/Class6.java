class Calculator
{
    int num = 5;

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class Class6{
    public static void main(String[] args) {
        // creating a virtual object
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
       // int result = c1.add(3,4);
       // System.out.println(result);
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}