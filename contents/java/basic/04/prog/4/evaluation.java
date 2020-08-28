import java.io.*;

public class evaluation{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("変数gradeの値を入力してください。");
    String str = br.readLine();
    int grade = Integer.parseInt(str);
    System.out.println("gradeの値は"+ grade);

    if (90 <= grade && grade <=100){
      System.out.println("5");
    } else if (80 <= grade && grade <90){
      System.out.println("4");
    } else if (70<= grade && grade < 80){
      System.out.println("3");
    } else if (60<= grade && grade <70){
      System.out.println("2");
    } else{
      System.out.println("1");
    }
  }
}
