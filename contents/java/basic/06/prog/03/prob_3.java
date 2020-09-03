import java.io.*;

public class prob_3{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("あなた以外は何人ですか。");
    String str1 = br.readLine();
    int num = Integer.parseInt(str1);

    System.out.println("あなたの得点を入力してください。");
    String str2 = br.readLine();
    int my_score = Integer.parseInt(str2);

    System.out.println("他の人の得点を入力してください。");

    int score[] = new int[num];
    for(int i = 0; i < num; i++){
      String str = br.readLine();
      score[i] = Integer.parseInt(str);
    }
    int rank = 1;
    for(int i = 0; i < num; i++){
      if (my_score < score[i])
        rank++;
    }
    System.out.println("あなたは第" + rank + "位です。");
  }
}
