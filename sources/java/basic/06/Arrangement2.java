import java.io.*;

public class Arrangement2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�������͂��܂����H");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int data[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "�ڂ̃f�[�^����͂��Ă��������B");
            str = br.readLine();
            data[i] = Integer.parseInt(str);
        }

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "�ڂ̃f�[�^�́A" + data[i] + "�ł��B");
        }
    }
}
