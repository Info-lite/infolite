import java.io.*;

public class Arrangement2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("いくつ入力しますか？");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int data[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "個目のデータを入力してください。");
            str = br.readLine();
            data[i] = Integer.parseInt(str);
        }

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "個目のデータは、" + data[i] + "です。");
        }
    }
}
