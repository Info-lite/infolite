public class Hito {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "なまえ";
        p1.age = 20;

        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.age = " + p1.age);
    }
}

class Person {
    String name;
    int age;

}
