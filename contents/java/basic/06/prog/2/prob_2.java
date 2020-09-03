public class prob_2{
  public static void main(String[] args){
    int Array[] = {4, 6, -3, 5, 2};
    int i = 1;
    int j = 3;

    for (int k = 0; k < Array.length; k++){
      System.out.println("Array[" + k + "]=" + Array[k]);
    }

    int tmp = Array[i];
    Array[i] = Array[j];
    Array[j] = tmp;

    System.out.println("入れ替え後");
    for (int k = 0; k < Array.length; k++){
      System.out.println("Array[" + k + "]=" + Array[k]);
    }
  }
}
