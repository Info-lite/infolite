public class prob_11{
  public static void main(String[] args){
    int dec = 11;
    int bin = dec;
    String ans = "";

    while (bin > 0){
      if (bin % 2 == 0){
        ans = "0" + ans;
      } else {
        ans = "1" + ans;
      }
      bin = bin / 2;
    }
    System.out.println("10進数で " + dec + " は、2進数で　" + ans);
  }
}
