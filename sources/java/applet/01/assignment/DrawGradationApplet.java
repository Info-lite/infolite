import java.applet.Applet;
import java.awt.*;

public class DrawGradationApplet extends Applet {
    public void paint(Graphics g) {
        for (int i = 0; i <= 255; i++) {
            g.setColor(new Color(0, 0, i));
            g.drawLine(i, 0, i, 255);
        }
    }
}
