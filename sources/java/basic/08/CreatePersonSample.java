public class CreatePersonSample {
    public static void main(String[] args) {
        Creature john = new Creature("John");

        john.age = 20;
        john.legs = 2;

        System.out.println("john.age = " + john.age);
        System.out.println("john.legs = " + john.legs);
        System.out.println("john.name = " + john.name);
    }
}

class Creature {
    int age;
    int legs;
    String name;

    Creature(String name) {
        this.name = name;
    }
}
