import java.io.*;

public class prob_2{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("値を入力してください。");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    boolean flag = false;

    for (int i = 2; i <= Math.sqrt(num); i++){
      if (num % i == 0){
        flag = true;
      }
    }

    if (flag == true || num < 2) {
      System.out.println(num + "は素数ではありません。");
    } else {
      System.out.println(num + "は素数です。");
    }
  }
}
