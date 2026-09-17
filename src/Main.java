//https://github.com/InvaderAsim/Inheritance.git

public class Main{

   public static void main(String[] args) {

    Person p1 = new Person();

    //    Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
    //
    //       IO.println(p2.name);

       Person p2 = new Person(72, 70);

       IO.println(p2.name);

       Person p3 = p2.Call_Private();

       Student s1 = new Student();
       s1.age = 20;
       s1.gpa = 4.00;
       IO.println(s1.gpa);
       IO.println("---------------");
       IO.println("");

       Instructor i1 = new Instructor();
       i1.age = 36;
       i1.height = 68;
       i1.name = "John Smith";
       i1.course_name = "English 101";
       i1.course_number = 4285;

       IO.println(i1.name + ", " + i1.age);
       IO.println(i1.course_name + ", Course Number: " + i1.course_number);

    }
}