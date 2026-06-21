enum Status{
    Running, Failed, Pending, Success;
}
public class Class26 {
    public static void main(String[] args) {
        Status s = Status.Pending;
//        Status[] ss = Status.values();
//        System.out.println(ss[0]);
//        for(Status st : ss){
//            System.out.println(st);
//        }
        if(s==Status.Running){
            System.out.println("All good");
        }
        else if(s==Status.Failed){
            System.out.println("Try again");
        }
        else if(s==Status.Pending){
            System.out.println("Please wait");
        }
        else{
            System.out.println("Done");
        }
        // We can also use switch
    }
}