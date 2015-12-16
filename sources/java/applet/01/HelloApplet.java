import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("こんにちは", 10, 10);
    }
}
