import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;


class ColorChoose extends JFrame{

    static boolean pause = true;

    JLabel l;

    JButton green, blue, darkGrey, emptyButton;

    String color;

    public ColorChoose(){
        l = new JLabel ("Choose color", SwingConstants.CENTER);
        add(l);

        blue = new JButton("Blue");
        add(blue);

        green = new JButton("Green");
        add(green);

        darkGrey = new JButton("Dark Grey");
        add(darkGrey);

        setVisible(true);
    }

    void stopOnWindow () {

        blue.addActionListener((ActionEvent e) -> {
            color = "blue";
            pause = false ;
        });

        green.addActionListener((ActionEvent e) -> {
            color = "green";
            pause = false ;
        });

        darkGrey.addActionListener((ActionEvent e) -> {
            color = "darkGrey";
            pause = false ;
        });

        while (pause) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }

        pause = true ;

    }

    public String getColor() {
        return color;
    }


}
