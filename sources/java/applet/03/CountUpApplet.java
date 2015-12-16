import java.applet.Applet;
import java.awt.*;

public class CountUpApplet extends Applet implements Runnable {
    int num;
    int x;

    public void init() {
        Thread th;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        try {
            for (num = 0; num < 100; num++) {
                repaint();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }

    public void paint(Graphics g) {
        g.drawString(Integer.toString(num), 10, 20);
    }

}
