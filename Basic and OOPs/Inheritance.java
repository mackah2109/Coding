//Inheritance 
//runtime polymorphism

class Shape{
    public void area(){
        System.out.println("Display");
    }
}

class Triangle extends Shape{
    public  void area(int h,int b){
        System.out.println((h*b)/2);
    }
}

public class Inheritance {
    public static void main(String args[]){

        Triangle t1=new Triangle();
        t1.area(4,6);
        Shape s=new Shape();
        s.area();
    }
}
