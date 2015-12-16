import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawCircleWithClickApplet extends Applet implements MouseListener {

    int diameter = 100;
    int xPoint;
    int yPoint;
    boolean isPressed;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        if (isPressed) {
            g.drawOval(xPoint - diameter / 2, yPoint - diameter / 2, diameter, diameter);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xPoint = e.getX();
        yPoint = e.getY();
        isPressed = true;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isPressed = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
