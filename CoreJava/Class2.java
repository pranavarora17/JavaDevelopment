public class Class2{
    public static void main(String[] args) {
        /*
        byte b = 127;
        int a = b;
        System.out.println(a);
         */
        /*
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);
         */
        /*
        Type Promotion
        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);
         */
        /*
        byte a = 10;
        byte b = 30;
        int result = a*b;
        System.out.println(result);
         */

        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2;
        System.out.println(result);

        int res1 = num1 - num2;

        System.out.println(res1);

        int res2 = num1*num2;
        System.out.println(res2);

        int res3 = num1/num2;
        System.out.println(res3);
        if(num1==7 | num2==5){
            System.out.println("Yes working");
        }
    }
}