public class HitoMod3 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "��s��";
        p1.age = 20;

        int temp = p1.getage();

        System.out.println("�N���" + temp + "�΂ł��B");
    }
}

class Person {
    String name;
    int age;

    void show() {
        System.out.println("���O�́A" + name + "�ł��B");
        System.out.println("�N��́A" + age + "�΂ł��B");
    }

    int getage() {
        return age;
    }

}
