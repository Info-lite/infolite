import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquationApplet extends Applet implements ActionListener {
    TextField box1, box2, box3, boxx1, boxx2;
    Label lb1, lb2, lb3, lb4, lb5;
    Button bt;
    int a, b, c;

    public void init() {
        box1 = new TextField("");
        add(box1);
        box1.addActionListener(this);

        lb1 = new Label("*x^2+");
        add(lb1);

        box2 = new TextField("");
        add(box2);
        box2.addActionListener(this);

        lb2 = new Label("*x+");
        add(lb2);

        box3 = new TextField("");
        add(box3);
        box3.addActionListener(this);

        bt = new Button("ÇÃâÇãÅÇﬂÇÈ");
        add(bt);
        bt.addActionListener(this);

        lb3 = new Label("âÇÕ");
        add(lb3);

        boxx1 = new TextField("");
        add(boxx1);
        boxx1.addActionListener(this);

        lb4 = new Label("Ç∆");
        add(lb4);

        boxx2 = new TextField("");
        add(boxx2);
        boxx2.addActionListener(this);

        lb5 = new Label("Ç≈Ç∑ÅB");
        add(lb5);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt) {
            String str1 = box1.getText();
            int a = Integer.parseInt(str1);

            String str2 = box2.getText();
            int b = Integer.parseInt(str2);

            String str3 = box3.getText();
            int c = Integer.parseInt(str3);

            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            String strx1 = Double.toString(x1);
            boxx1.setText(strx1);

            String strx2 = Double.toString(x2);
            boxx2.setText(strx2);
        }
    }
}
