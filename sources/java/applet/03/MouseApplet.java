import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseApplet extends Applet implements MouseListener {
    int mode;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        mode = 1;
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        mode = 2;
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mode = 3;
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mode = 4;
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mode = 5;
        repaint();
    }

    public void paint(Graphics g) {
        switch (mode) {
            case 1:
                g.drawString("�N���b�N���܂����B", 10, 10);
                break;
            case 2:
                g.drawString("�{�^���������Ă��܂��B", 10, 10);
                break;
            case 3:
                g.drawString("�{�^���𗣂��܂����B", 10, 10);
                break;
            case 4:
                g.drawString("�E�B���h�E���ɓ���܂����B", 10, 10);
                break;
            case 5:
                g.drawString("�E�B���h�E�O�ł��B", 10, 10);
                break;
        }
    }

}
