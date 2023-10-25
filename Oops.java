//class Pen{
//    String color;
//    String type;
//
//    public void write(){
//        System.out.println("Wreitteing  somthirng");
//    }
//
//    public void printcolor(){
//        System.out.println(this.color);
//    }
//
//}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
    }
}


public class Oops {
    public static void main(String[] args) {
        //Pen pen1=new Pen();
        //pen1.color="Blue";
        //pen1.type="Gell";
        //Pen pen2=new Pen();
        //pen2.color="Red";
        Student s1=new Student();
        s1.name="Kuldeep";
        s1.printInfo();
    }
    

        //pen1.write();
        //pen1.printcolor();
        //pen2.printcolor();
        
    }
    

