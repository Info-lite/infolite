import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("���O����͂��Ă��������B");
        String str = br.readLine();
        System.out.println("���Ȃ��̖��O�́A" + str + "�ł��ˁB");
    }
}
