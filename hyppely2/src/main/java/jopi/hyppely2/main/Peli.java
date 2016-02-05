package hyppely.main;

import java.awt.BorderLayout;
import hyppely.main.PeliPaneeli;
import hyppely.main.PeliPaneeli;
import javax.swing.JFrame;


public class Peli {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(new PeliPaneeli(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}