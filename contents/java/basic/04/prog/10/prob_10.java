import java.io.*;

public class prob_10{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("文字を入力してください。");
    String str = br.readLine();

    if (Character.isUpperCase(str.charAt(0))) {
      System.out.println(str.toLowerCase());
    } else {
      System.out.println(str.toUpperCase());
    }
  }
}
