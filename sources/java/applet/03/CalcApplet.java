import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcApplet extends Applet implements ActionListener {
    TextField box1, box2, box3;
    Label lb1, lb2;
    Button bt;

    public void init() {
        box1 = new TextField("");
        add(box1);
        box1.addActionListener(this);

        lb1 = new Label("Å{");
        add(lb1);

        box2 = new TextField("");
        add(box2);
        box2.addActionListener(this);

        lb2 = new Label("ÅÅ");
        add(lb2);

        box3 = new TextField("");
        add(box3);
        box3.addActionListener(this);

        bt = new Button("é¿çs");
        add(bt);
        bt.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt) {
            String str1 = box1.getText();
            int a = Integer.parseInt(str1);

            String str2 = box2.getText();
            int b = Integer.parseInt(str2);

            String str3 = Integer.toString(a + b);
            box3.setText(str3);
        }
    }

}
