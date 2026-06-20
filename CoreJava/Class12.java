class ABC{
    public ABC(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("In a show");
    }
}
class Class12{
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.show();
        new ABC().show();
    }
}