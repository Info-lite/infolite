import java.io.*;

public class prob_1{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("値を入力してください。");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    int ans = 0;

    for (int i = 1; i <= num; i++){
      ans = ans + i;
    }

    System.out.println("1から" + num + "までの和は、" + ans + "です。");
  }
}
