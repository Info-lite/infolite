import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCountApplet extends Applet implements ActionListener {
    Button bt;
    int i = 0;

    public void init() {
        bt = new Button("ボタン");
        this.add(bt);
        bt.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("ボタンを押した回数：" + i, 10, 50);
    }

    public void actionPerformed(ActionEvent ae) {
        i++;
        repaint();
    }

}
