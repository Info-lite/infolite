import java.io.*;

public class CalcRank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("���Ȃ��ȊO�͉��l�ł���");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int count = 1;
        int x[] = new int[num];

        System.out.println("���Ȃ��̓��_����͂��Ă��������B");
        str = br.readLine();
        int score = Integer.parseInt(str);

        System.out.println("���̐l�̓��_����͂��Ă��������B");
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            x[i] = Integer.parseInt(str);
            if (score < x[i]) count++;
        }

        System.out.println("���Ȃ��͑�" + count + "�ʂł�");

    }
}
