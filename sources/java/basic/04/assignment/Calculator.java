import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�P�߂̒l����͂��Ă��������B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("�Q�߂̒l����͂��Ă��������B");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        System.out.println("�v�Z���@���w�肵�Ă��������B");
        System.out.println("�P�F�����Z�@�Q�F�����Z�@�R�F�|���Z�@�S�F����Z");
        String str3 = br.readLine();
        int mode = Integer.parseInt(str3);

        if (mode == 1) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (mode == 2) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (mode == 3) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (mode == 4) {
            System.out.println(a + " / " + b + " = " + (a / b) + "���܂�" + (a % b));
        } else {
            System.out.println("�v�Z���@�ɂ�1����4�܂ł̐�������͂��Ă��������B");
        }
    }
}
