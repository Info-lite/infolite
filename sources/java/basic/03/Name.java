import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("名前を入力してください。");
        String str = br.readLine();
        System.out.println("あなたの名前は、" + str + "ですね。");
    }
}
