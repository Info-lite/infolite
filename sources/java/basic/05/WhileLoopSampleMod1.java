public class WhileLoopSampleMod1 {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            System.out.println("x = " + x);
            x = x + 1;
            if (x == 3) break;
        }
    }
}