
class Pen{
    //object
    String color;
    String type;//ball;gel

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class pens {
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();

        Pen pen2=new Pen();
        pen2.color="Black";
        pen2.type="Ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}
