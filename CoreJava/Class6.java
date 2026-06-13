class Calculator
{
    int a;

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
        Calculator c1 = new Calculator();
        int result = c1.add(3,4);
        System.out.println(result);
    }
}