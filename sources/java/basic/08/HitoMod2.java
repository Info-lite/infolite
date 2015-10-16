public class HitoMod2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "首都大";
        p1.age = 20;

        p1.show();
    }
}

class Person {
    String name;
    int age;

    void show() {
        System.out.println("名前は、" + name + "です。");
        System.out.println("年齢は、" + age + "歳です。");
    }

}
