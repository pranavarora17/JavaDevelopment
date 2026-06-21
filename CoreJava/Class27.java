enum Lapitop{
    Macbook(2000),XPS(2200),Surface,Thinkpad(1200);
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Lapitop(int price) {
        this.price = price;
    }

    Lapitop() {
        price = 500;
    }
}
public class Class27 {
    public static void main(String[] args) {
        //Lapitop lap = Lapitop.Macbook;
        //System.out.println(lap);
        //System.out.println(lap.getPrice());
        for(Lapitop lp : Lapitop.values()){
            System.out.println(lp);
        }
    }
}
