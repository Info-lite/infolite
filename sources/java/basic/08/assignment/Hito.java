public class Hito {
    public static void main(String[] args) {
        Person p1 = new Person();

        int temp = p1.add(1, 2);
        System.out.println("add = " + temp);
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

    void future_age(int year) {
        age += year;
        System.out.println(year + "�N��̔N��́A" + age + "�΂ł��B");
    }

    int add(int x, int y) {
        return (x + y);
    }

}
