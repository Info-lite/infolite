public class HitoMod4 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "��s��";
        p1.age = 20;

        int temp = p1.getage();

        System.out.println("�N���" + temp + "�΂ł��B");
        p1.future_age(5);
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
}
