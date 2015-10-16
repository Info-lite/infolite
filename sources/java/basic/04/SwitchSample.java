import java.io.*;

public class SwitchSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        switch (a) {
            case 1:
                System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚P‚Å‚·‚ËB");
                break;
            case 2:
                System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚Q‚Å‚·‚ËB");
                break;
            case 3:
                System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚R‚Å‚·‚ËB");
                break;
            default:
                System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚PA‚QA‚R‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
        }
    }
}
