import java.io.*;

public class CalcRank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("あなた以外は何人ですか");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        int count = 1;
        int x[] = new int[num];

        System.out.println("あなたの得点を入力してください。");
        str = br.readLine();
        int score = Integer.parseInt(str);

        System.out.println("他の人の得点を入力してください。");
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            x[i] = Integer.parseInt(str);
            if (score < x[i]) count++;
        }

        System.out.println("あなたは第" + count + "位です");

    }
}
