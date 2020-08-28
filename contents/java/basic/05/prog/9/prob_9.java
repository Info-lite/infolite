public class prob_9{
  public static void main(String[] args){
    for (int i = 0; i < 7; i++){
      String tmp = "";
      for (int j = 0; j < 6; j++){
        if (j == 5){
          tmp = "\n";
        }
        System.out.printf("*" + tmp);
      }
    }
  }
}
