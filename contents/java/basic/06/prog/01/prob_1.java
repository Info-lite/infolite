public class prob_1{
  public static void main(String[] args){
    int[] Array;
    Array = new int[5];
    Array[0] = 4;
    Array[1] = 6;
    Array[2] = -3;
    Array[3] = 5;
    Array[4] = 2;

    Array[1] = Array[1] / Array[3];
    System.out.println(Array[1]);
  }
}
