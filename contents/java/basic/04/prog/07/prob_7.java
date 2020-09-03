import java.io.*;

public class prob_7{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("西暦を入力してください。");
    String str = br.readLine();
    int year = Integer.parseInt(str);

    System.out.println(year+"年");
  	switch((year+8)%12){
  	case 0:
  	    System.out.println("子");
        System.out.println("来年の干支：丑");
  	    break;
  	case 1:
        System.out.println("丑");
        System.out.println("来年の干支：寅");
        break;
  	case 2:
  	    System.out.println("寅");
        System.out.println("来年の干支：卯");
  	    break;
          case 3:
  	    System.out.println("卯");
        System.out.println("来年の干支：辰");
  	    break;
  	case 4:
  	    System.out.println("辰");
        System.out.println("来年の干支：巳");
  	    break;
  	case 5:
  	    System.out.println("巳");
        System.out.println("来年の干支：午");
  	    break;
  	case 6:
  	    System.out.println("午");
        System.out.println("来年の干支：未");
  	    break;
  	case 7:
  	    System.out.println("未");
        System.out.println("来年の干支：申");
  	    break;
  	case 8:
  	    System.out.println("申");
        System.out.println("来年の干支：酉");
  	    break;
          case 9:
  	    System.out.println("酉");
        System.out.println("来年の干支：戌");
  	    break;
  	case 10:
  	    System.out.println("戌");
        System.out.println("来年の干支：亥");
  	    break;
  	case 11:
  	    System.out.println("亥");
        System.out.println("来年の干支：子");
  	    break;
  	default:
  	    break;
  	}
  }
}
