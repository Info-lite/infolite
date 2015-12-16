import java.io.*;

public class Pyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("値を入力してください。");
        String str = br.readLine();
        int a = Integer.parseInt(str);

        System.out.println();

        int j = 1;
        for (int i = 1; i <= a * a; i++) {
            System.out.print(i + " ");
            if (i == j * j) {
                System.out.println();
                j++;
            }
        }

    }
}
