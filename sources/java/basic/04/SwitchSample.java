import java.io.*;

public class SwitchSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("��������͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        switch (a) {
            case 1:
                System.out.println("���͂����̂͂P�ł��ˁB");
                break;
            case 2:
                System.out.println("���͂����̂͂Q�ł��ˁB");
                break;
            case 3:
                System.out.println("���͂����̂͂R�ł��ˁB");
                break;
            default:
                System.out.println("���͂����̂͂P�A�Q�A�R�ł͂���܂���B");
        }
    }
}
