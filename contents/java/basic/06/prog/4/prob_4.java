import java.io.*;

public class prob_4{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("テストの受験者数を入力してください。");
    String str1 = br.readLine();
    int num = Integer.parseInt(str1);

    System.out.println("点数を入力してください。");

    int total = 0;
    int score[] = new int[num];
    for(int i = 0; i < num; i++){
      String str = br.readLine();
      score[i] = Integer.parseInt(str);
      total = total + score[i];
    }

    double avr = total / num;
    System.out.println("平均は" + avr + "点です。");
    System.out.print("平均点以上は");

    int count = 0;
    for(int i = 0; i < num; i++){
      if(score[i] >= avr){
        System.out.print("、" + score[i] + "点");
        count++;
      }
    }
    System.out.println("の" + count + "人です。");
  }
}
