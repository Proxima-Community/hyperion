package src.main.com.proxima.hyperion;
import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class Main {
      
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        JPanel panel  = new JPanel() {
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(Color.BLACK);
                g2.fillRect(0,0,getWidth(), getHeight());

                g2.setColor(Color.WHITE);
                Vector4 vec = new Vector4(1,2,3,1);
                render render = new render();
                Vector2 vec2 = render.renderPoint(vec);

                g2.drawOval((int)vec2.values[0], (int)vec2.values[1],10,10);
            }
        };


        pane.add(panel, BorderLayout.CENTER);
        frame.setSize(600,600);
        frame.setVisible(true);

        

    }
}