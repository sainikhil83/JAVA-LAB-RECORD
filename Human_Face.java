import java.awt.*;
import javax.swing.*;

public class Human_Face extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        Color skinColor = new Color(255, 179, 86);
        g.setColor(skinColor);
        g.fillOval(100, 100, 250, 300);

        g.setColor(Color.black);
        g.drawOval(100, 100, 250, 300);

        // Eyes
        g.fillOval(160, 185, 40, 25);
        g.fillOval(250, 185, 40, 25);

        // Eyebrows
        g.drawArc(160, 165, 40, 15, 0, 180);
        g.drawArc(250, 165, 40, 15, 0, 180);

        // Nose
        g.drawLine(220, 230, 210, 275);
        g.drawLine(210, 275, 240, 275);

        // Smile
        g.drawArc(175, 290, 100, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        Human_Face face = new Human_Face();

        face.setBackground(Color.white);
        frame.add(face);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}