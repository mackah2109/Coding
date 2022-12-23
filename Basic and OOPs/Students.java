class Student{

    String name;
    int age;
    
    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){//Student(Student s2) copy constructor
        this.name=name;  //this.name=s2.name;
        this.age=age;
    }
}

public class Students {
    public static void main(String args[]){

        Student s1=new Student("Muskan",19);//parameterized constructor
        //Student s2=new Student(s1);
        s1.Info();
    }
    
}
