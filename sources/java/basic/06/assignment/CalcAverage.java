import java.io.*;

public class CalcAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă��������B");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int x[] = new int[num];
        double average = 0;

        System.out.println("�_������͂��Ă��������B");
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            x[i] = Integer.parseInt(str);
            average += x[i];
        }

        average /= num;

        System.out.println("���ϓ_��" + average + "�_�ł��B");
        System.out.print("���ϓ_�ȏ�́A");

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (x[i] > average) {
                System.out.print(x[i] + "�_�A");
                count++;
            }
        }
        System.out.println("��" + count + "�l�ł��B");

    }
}
