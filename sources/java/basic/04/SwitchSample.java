import java.io.*;

public class SwitchSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("数字を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        switch (a) {
            case 1:
                System.out.println("入力したのは１ですね。");
                break;
            case 2:
                System.out.println("入力したのは２ですね。");
                break;
            case 3:
                System.out.println("入力したのは３ですね。");
                break;
            default:
                System.out.println("入力したのは１、２、３ではありません。");
        }
    }
}
