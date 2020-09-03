public class prob_5{
  public static void main(String[] args){
    int Array[] = {4, 0, 9, 7, 3, 1, 2, 6, 8, 5};

    System.out.println("並べ替え前");
    for (int i = 0; i < 10; i++){
      System.out.println("Array[" + i + "]=" + Array[i]);
    }

    for (int i = 0; i < 9; i++){
      for (int j = 9; j > i; j--){
        if (Array[j] < Array[j-1]){
          int val = Array[j];
          Array[j] = Array[j-1];
          Array[j-1] = val;
        }
      }
    }

    System.out.println("並べ替え後");
    for (int i = 0; i < 10; i++){
      System.out.println("Array[" + i + "]=" + Array[i]);
    }
  }
}
