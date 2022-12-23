abstract class Animal{
    abstract void walk();//abstract 

    //creating constructor
    Animal(){
        System.out.println("you created a animal");
    }
    public void eats(){//non abstract method
        System.out.println("eats");
    }
}

class Horse extends Animal{
    //constructor
    Horse(){
        System.out.println("you created horse");
    }
    public void walk(){
        System.out.println("walk with 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk with 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){

        Horse horse=new Horse();
        horse.walk();
        horse.eats();

        //Animal animal=new Animal()
        // you cannot create above because it is abstract class 
        //constructor chaining when we call more than one constructor in inheritance
    }
    
}
