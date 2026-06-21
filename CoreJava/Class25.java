interface ComputerHE{
     void code();
}
class Laptop implements ComputerHE{
    public void code(){
        System.out.println("Code,Compile, Run");
    }
}
class Desktop implements ComputerHE{
    public void code(){
        System.out.println("Code,Compile, Run!");
    }
}
class Developer{
    public void devApp(ComputerHE lap){
        lap.code();
    }
}
public class Class25 {
    public static void main(String[] args) {
        ComputerHE lap = new Laptop();
        ComputerHE desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(lap);


    }
}
