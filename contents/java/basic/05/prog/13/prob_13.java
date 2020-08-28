public class prob_13{
  public static void main(String[] args){
    boolean flag;

    for (int i = 1; i <= 100; i++){
      flag = false;
      for (int j = 1; j * j <= 100; j++){
        if (j * j == i || j * j * j == i)
          flag = true;
        if (flag == true)
          break;
      }
      if (flag == false)
        System.out.println(i);
    }
  }
}
