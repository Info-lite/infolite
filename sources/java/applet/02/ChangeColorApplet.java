import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColorApplet extends Applet implements ActionListener {
    Button bt1, bt2;
    boolean flag;

    public void init() {
        bt1 = new Button("��");
        this.add(bt1);
        bt1.addActionListener(this);

        bt2 = new Button("��");
        this.add(bt2);
        bt2.addActionListener(this);
    }

    public void paint(Graphics g) {
        if (flag) g.setColor(Color.blue);
        else g.setColor(Color.red);
        g.drawString("�{�^���������ƁA�����̐F���ς��܂��B", 10, 50);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            flag = true;
        } else if (ae.getSource() == bt2) {
            flag = false;
        }
        repaint();
    }

}
