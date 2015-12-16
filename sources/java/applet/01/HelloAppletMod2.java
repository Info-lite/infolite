import java.applet.Applet;
import java.awt.*;

public class HelloAppletMod2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("こんにちは", 10, 10);
        g.drawLine(100, 100, 200, 200);
    }
}
