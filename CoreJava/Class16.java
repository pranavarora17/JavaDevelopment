class AB{
    public void show(){
        System.out.println("In AB show");
    }
}
class CD extends AB{
   // System.out.println("In CD show");
}
class EF extends CD{
    //System.out.println("In EF show");
}
class Class16{
    public static void main(String[] args) {
        AB obj = new CD();
        obj.show();
    }
}