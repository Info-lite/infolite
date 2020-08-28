public class prob_8 {
  public static void main(String[] args) {
    System.out.println("二次方程式 ax^2+bx+c=0");
    double a = 1;
    double b = 2;
    double c = 1;

    System.out.println(a + "x^2 + " + b + "x + " + c + "= 0");

    if (b*b==4*a*c){
  	    System.out.println("x = "+(-b/(2*a)));
  	}else if(b*b>4*a*c){
  	    System.out.println("x = "+((-b+Math.sqrt(b*b-4*a*c))/(2*a)));
  	    System.out.println("x = "+((-b-Math.sqrt(b*b-4*a*c))/(2*a)));
  	}else if(b*b<4*a*c){
  	    System.out.println("x = "+(-b/2*a)+"+"+(Math.sqrt(4*a*c-b*b)/(2*a))+"i");
  	    System.out.println("x = "+(-b/2*a)+"-"+(Math.sqrt(4*a*c-b*b)/(2*a))+"i");
  	}
  }
}
