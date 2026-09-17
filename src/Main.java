
public class Main{

   public static void main(String[] args) {

    Person p1 = new Person();

    //    Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
    //
    //       IO.println(p2.name);

       Person p2 = new Person(72, 70);

       IO.println(p2.name);

       Person p3 = p2.Call_Private();
    }
}