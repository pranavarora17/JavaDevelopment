class akaa{
    final int num =5 ;
    public void show(){
        System.out.println("This is from akaa class");
    }
}
class bakka extends akaa{
    //num = 6;
    public void show(){
        System.out.println("This is from bakka class");
    }
}


class Class17{
    public static void main(String[] args) {
        akaa obj = new bakka();
    }
}
