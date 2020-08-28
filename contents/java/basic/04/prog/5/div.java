import java.io.*;

public class div{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    System.out.println("xの値を入力してください。");
    String str = br.readLine();
    int x = Integer.parseInt(str);

    if (x == 0){
      System.out.println("error");
    } else {
        System.out.println("100/x = " + (double) 100 / x);
    }
  }
}
