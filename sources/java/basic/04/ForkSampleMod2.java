import java.io.*;

public class ForkSampleMod2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("��������͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        if (a == 1) {
            System.out.println("���͂����̂͂P�ł��ˁB");
        } else if (a == 2) {
            System.out.println("���͂����̂͂Q�ł��ˁB");
        } else if (a == 3) {
            System.out.println("���͂����̂͂R�ł��ˁB");
        } else {
            System.out.println("���͂����̂͂P�A�Q�A�R�ł͂���܂���B");
        }
    }
}
