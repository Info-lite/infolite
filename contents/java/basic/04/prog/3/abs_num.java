import java.io.*;

public class abs_num{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("値を入力してください。");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    
	  System.out.println("入力された数字:"+num);

	  if(num<0){
	  num = -num;
	  System.out.println("|-"+num+"| = "+num);
	  }else{
	  System.out.println("|"+num+"| = "+num);
	  }

	//	System.out.println("|"+num+"| = "+Math.abs(num));
    }
}
