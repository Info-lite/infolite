import java.io.*;

public class DivideSampleMod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�P�߂̒l����͂��Ă��������B");
        String str1 = br.readLine();
        double a = Double.parseDouble(str1);

        System.out.println("�Q�߂̒l����͂��Ă��������B");
        String str2 = br.readLine();
        double b = Double.parseDouble(str2);

        double ans = a / b;

        System.out.println(a + "���" + b + "��" + ans);
    }
}
