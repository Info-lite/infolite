import java.io.*;

public class prob_7{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("項数を入力してください。");
    String str = br.readLine();
    int num = Integer.parseInt(str);

    int fib[] = new int[num];
    fib[0] = 1;
    fib[1] = 1;

    for (int i = 2; i < fib.length; i++){
      fib[i] = fib[i - 1] + fib[i - 2];
    }

    for (int i = 0; i < fib.length; i++){
      System.out.println("fib[" + i + "]=" + fib[i]);
    }
  }
}
