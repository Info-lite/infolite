import java.io.*;

public class Comparing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�P�߂̒l����͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("�Q�߂̒l����͂��Ă��������B");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        if (a == b) System.out.println("�Q�̐��͓������ł��B");
        else if (a > b) System.out.println(a + "�̂ق����傫���ł��B");
        else System.out.println(b + "�̂ق����傫���ł��B");
    }
}
