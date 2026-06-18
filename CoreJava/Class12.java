class A{
    public A(){

    }
    public void show(){
        System.out.println("In a show");
    }
}
class Class12{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}