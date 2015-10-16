import java.io.*;

public class Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("三角形の底辺と高さの値を入力してください。");
		String baseString = br.readLine();
		int base = Integer.parseInt(baseString);

		String heightString = br.readLine();
		int height = Integer.parseInt(heightString);

		System.out.println("三角形の面積は、" + (double) base * height / 2 + "です");
	}
}

