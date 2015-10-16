import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("‚P‚Â‚ß‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("‚Q‚Â‚ß‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        System.out.println("ŒvZ•û–@‚ğw’è‚µ‚Ä‚­‚¾‚³‚¢B");
        System.out.println("‚PF‘«‚µZ@‚QFˆø‚«Z@‚RFŠ|‚¯Z@‚SFŠ„‚èZ");
        String str3 = br.readLine();
        int mode = Integer.parseInt(str3);

        if (mode == 1) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (mode == 2) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (mode == 3) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (mode == 4) {
            System.out.println(a + " / " + b + " = " + (a / b) + "‚ ‚Ü‚è" + (a % b));
        } else {
            System.out.println("ŒvZ•û–@‚É‚Í1‚©‚ç4‚Ü‚Å‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        }
    }
}
