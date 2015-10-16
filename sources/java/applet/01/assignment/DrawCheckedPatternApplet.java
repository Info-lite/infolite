import java.applet.Applet;
import java.awt.*;

public class DrawCheckedPatternApplet extends Applet {

    int maxWidth = 1000;
    int maxHeight = 1000;
    int side = 100;

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, maxWidth, maxHeight);

        g.setColor(Color.BLACK);
        for (int y = 0; y <= (maxHeight / side); y++) {
            for (int x = 0; x <= (maxWidth / side); x++) {
                if ((x + y) % 2 == 0) {
                    g.fillRect(x * side, y * side, side, side);
                }
            }

        }
    }

}
