import java.io.*;

public class Calc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�P�߂̒l����͂��Ă��������B");
		String value1 = br.readLine();
		int a = Integer.parseInt(value1);

		System.out.println("�Q�߂̒l����͂��Ă��������B");
		String value2 = br.readLine();
		int b = Integer.parseInt(value2);

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b) + " ���܂� " + (a % b));
	}
}

