import java.io.*;

public class CalcPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�l����͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + "�͑f���ł͂���܂���B");
                break;
            }
        }

        if (a == i) System.out.println(a + "�͑f���ł��B");
    }
}
