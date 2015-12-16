import java.io.*;

public class Equation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;
        double d, ans1, ans2;

        System.out.println("２次方程式 ax^2+bx+c=0 を解きます。");
        System.out.println("a,b,cの値を入力してください。");
        System.out.print("a = ");
        String str = br.readLine();
        a = Integer.parseInt(str);

        System.out.print("b = ");
        str = br.readLine();
        b = Integer.parseInt(str);

        System.out.print("c = ");
        str = br.readLine();
        c = Integer.parseInt(str);

        d = b * b - 4 * a * c;

        if (d > 0) {
            ans1 = (-b + Math.sqrt(d)) / (2 * a);
            ans2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("解は、" + ans1 + "と" + ans2 + "です。");
        } else if (d == 0) {
            ans1 = -b / (2 * a);
            System.out.println("解は、" + ans1 + "です。");
        } else {
            System.out.println("実数解はありません。");
            /*
            ans1 = -b/(2*a);
		    ans2 = Math.sqrt(-d)/(2*a);
		    System.out.println("解は、"+ ans1 +" + "+ ans2 + "i , "+ ans1 +" - "+ ans2 + "i");
		    */
        }

    }
}
