import java.io.*;

public class CalcAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("テストの受験者数を入力してください。");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int x[] = new int[num];
        double average = 0;

        System.out.println("点数を入力してください。");
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            x[i] = Integer.parseInt(str);
            average += x[i];
        }

        average /= num;

        System.out.println("平均点は" + average + "点です。");
        System.out.print("平均点以上は、");

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (x[i] > average) {
                System.out.print(x[i] + "点、");
                count++;
            }
        }
        System.out.println("の" + count + "人です。");

    }
}
