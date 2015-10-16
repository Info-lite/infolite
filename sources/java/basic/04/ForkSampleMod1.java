import java.io.*;

public class ForkSampleMod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        if (a == 1) {
            System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚P‚Å‚·‚ËB");
        } else {
            System.out.println("“ü—Í‚µ‚½‚Ì‚Í‚P‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
        }
    }
}
