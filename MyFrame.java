package pl.michal;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    Graphic grafika = new Graphic();

    public MyFrame(){

        this.setTitle("Krzywe Bezier");
        grafika.setPreferredSize(new Dimension(800,600));
        this.add(grafika);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

}
