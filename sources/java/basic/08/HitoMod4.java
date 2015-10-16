public class HitoMod4 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "首都大";
        p1.age = 20;

        int temp = p1.getage();

        System.out.println("年齢は" + temp + "歳です。");
        p1.future_age(5);
    }
}

class Person {
    String name;
    int age;

    void show() {
        System.out.println("名前は、" + name + "です。");
        System.out.println("年齢は、" + age + "歳です。");
    }

    int getage() {
        return age;
    }

    void future_age(int year) {
        age += year;
        System.out.println(year + "年後の年齢は、" + age + "歳です。");
    }
}
