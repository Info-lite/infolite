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

    int add(int x, int y) {
        return (x + y);
    }

}
