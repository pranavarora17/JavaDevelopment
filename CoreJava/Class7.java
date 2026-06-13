class Computer{
    public void playMusic(){
        System.out.println("Playing Music..");
    }
    public String getMeAPen(int cost){
        return "Pen";
    }
}
class Class7{
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.playMusic();
        String v = c1.getMeAPen(10);
        System.out.println(v);
    }
}