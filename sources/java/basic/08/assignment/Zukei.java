import java.io.*;

public class Zukei {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Circle en = new Circle();

        System.out.println("���a�̒l����͂��Ă��������B");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        en.input_radius(num);

        double temp;
        temp = en.area();
        System.out.println("�ʐς́A" + temp + "�ł��B");

        temp = en.circuit();
        System.out.println("�~���́A" + temp + "�ł��B");

    }
}


class Circle {
    int r;

    double area() {
        return (r * r * 3.14);
    }

    double circuit() {
        return (2 * r * 3.14);
    }

    void input_radius(int num) {
        r = num;
    }

}
