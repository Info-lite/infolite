public class HitoMod2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "��s��";
        p1.age = 20;

        p1.show();
    }
}

class Person {
    String name;
    int age;

    void show() {
        System.out.println("���O�́A" + name + "�ł��B");
        System.out.println("�N��́A" + age + "�΂ł��B");
    }

}
