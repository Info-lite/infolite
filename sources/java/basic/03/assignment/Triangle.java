import java.io.*;

public class Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�O�p�`�̒�ӂƍ����̒l����͂��Ă��������B");
		String baseString = br.readLine();
		int base = Integer.parseInt(baseString);

		String heightString = br.readLine();
		int height = Integer.parseInt(heightString);

		System.out.println("�O�p�`�̖ʐς́A" + (double) base * height / 2 + "�ł�");
	}
}

