package src.main.com.proxima.hyperion;
import javax.swing.*;


public class Main {
      
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Display graphics = new Display();

        frame.add(graphics);
        frame.setSize(400,500);
        frame.setVisible(true);

    }
}