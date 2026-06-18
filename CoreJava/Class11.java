class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    static{
        name = "SmartPhone";
        System.out.println("Static block is executed");
            }
    public void show(){
        System.out.println(brand + " : "+ price+ " : "+ name);
    }
//    public static void show1(){
//        System.out.println("In static method");
    }
class Class11{
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        //obj1.name = "SmartPhone";

      Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//       // obj2.name = "Smartphone";

        obj1.show();
     //   obj2.show();
      //  Mobile.show1();
    }
}