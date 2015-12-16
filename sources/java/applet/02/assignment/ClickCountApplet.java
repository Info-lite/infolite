import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCountApplet extends Applet implements ActionListener {
    Button bt1, bt2;
    int i = 0;

    public void init() {
        bt1 = new Button("＋");
        this.add(bt1);
        bt1.addActionListener(this);

        bt2 = new Button("−");
        this.add(bt2);
        bt2.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("ボタンを押した回数：" + i, 10, 50);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            i++;
        } else if (ae.getSource() == bt2) {
            i--;
        }
        repaint();
    }

}
