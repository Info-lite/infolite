import java.io.*;

public class DivideSampleMod3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�P�߂̒l����͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("�Q�߂̒l����͂��Ă��������B");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        double ans = (double) a / b;

        System.out.println(a + "���" + b + "��" + ans);
    }
}
