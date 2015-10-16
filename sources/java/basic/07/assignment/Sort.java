import java.io.*;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("’l‚ğ3‚Â“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        int num[] = new int[3];

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            num[i] = Integer.parseInt(str);
        }

        int temp;
        if (num[0] < num[1]) {
            temp = num[0];
            num[0] = num[1];
            num[1] = temp;
        }

        if (num[1] < num[2]) {
            temp = num[1];
            num[1] = num[2];
            num[2] = temp;
            if (num[0] < num[1]) {
                temp = num[0];
                num[0] = num[1];
                num[1] = temp;
            }
        }

        for (int i = 0; i < 3; i++) System.out.print(num[i] + ",");

    }
}
