import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFigureApplet extends Applet implements ActionListener {
    Button bt1, bt2, bt3;
    int flag;

    public void init() {
        bt1 = new Button("三角形");
        this.add(bt1);
        bt1.addActionListener(this);

        bt2 = new Button("四角形");
        this.add(bt2);
        bt2.addActionListener(this);

        bt3 = new Button("円");
        this.add(bt3);
        bt3.addActionListener(this);
    }

    public void paint(Graphics g) {
        if (flag == 1) {
            int x[] = {75, 50, 100};
            int y[] = {50, 100, 100};
            g.drawPolygon(x, y, 3);
        } else if (flag == 2) {
            g.drawRect(50, 50, 50, 50);
        } else if (flag == 3) {
            g.drawOval(50, 50, 50, 50);
        } else {
            g.drawString("ボタンを押してください", 10, 50);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            flag = 1;
        } else if (ae.getSource() == bt2) {
            flag = 2;
        } else if (ae.getSource() == bt3) {
            flag = 3;
        }
        repaint();
    }
}
