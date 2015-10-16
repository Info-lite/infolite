public class Arrangement {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];

        a[0] = 10;
        a[1] = 25;
        a[2] = 30;
        a[3] = 55;
        a[4] = 85;

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "番目のデータは、" + a[i] + "です。");
        }
    }
}
