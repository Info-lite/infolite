import java.io.*;

public class ForkSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("��������͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        if (a == 1) {
            System.out.println("���͂����̂͂P�ł��ˁB");
        }
    }
}
