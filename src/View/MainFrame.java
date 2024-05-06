package view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.plaf.DimensionUIResource;

public class MainFrame extends JFrame {
    public void iniciar() {
        setTitle("Welcome");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
