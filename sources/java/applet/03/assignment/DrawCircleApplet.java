import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircleApplet extends Applet implements ActionListener {

    int radius = 0;
    TextField radiusField;
    Button drawButton;

    public void init() {
        radiusField = new TextField(2);
        add(radiusField);

        drawButton = new Button("DRAW");
        add(drawButton);
        drawButton.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawOval(10, 10, radius, radius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            radius = Integer.parseInt(radiusField.getText());
            repaint();
        }
    }
}
