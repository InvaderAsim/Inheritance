//Private and protected are not allowed as class access modifiers
public class Person {
    //height, age, color, name, weight

    double height;

    int age;

    String color;

    String name;

    double weight;

    //constructors can have private, protected, public access modifiers
    Person(){
        //Default constructors can be empty
        height = 48;
        age = 18;
        color = "Black";
        name = "";
        weight = 140;

    }
    //Protected members are accessible within the same package - Java files under same directory/folder
    protected Person(double height, int age) {
        this.height = height;
        this.age = age;

    }
    //Overloaded constructor
    private Person(double height, int age, String color, String name, double weight){
        // Parameters are local variables to the constructor
        this.height = height;
        this.weight = weight;
        this. color = color;
        this.name = name;
        this.age = age;
    }

    // Setter and Getter
    //Methods

    public Person Call_Private(){
        Person p3 = new Person(72, 70, "Black", "Barack Obama", 170);
        return p3;
    }

}



