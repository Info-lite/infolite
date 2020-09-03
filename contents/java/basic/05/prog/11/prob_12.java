import java.io.*;

public class prob_12{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("月を入力してください。");
    String str = br.readLine();
    int month = Integer.parseInt(str);
    int day;
    month++;

    switch (month % 12){
      case 2:
        day = 28;
        break;
      case 4:
        day = 30;
        break;
      case 6:
        day = 30;
        break;
      case 9:
        day = 30;
        break;
      case 11:
        day = 30;
        break;
      default:
        day = 31;
    }

    System.out.println("次の月のカレンダー");
    for (int i = 1; i <= day; i++){
      System.out.printf("%3d", i);

      if (i % 7 == 0){
        System.out.println();
      }
    }
    System.out.println();
  }
}
