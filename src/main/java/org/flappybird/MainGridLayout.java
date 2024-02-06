package org.flappybird;

import javax.swing.*;
import java.awt.*;

public class MainGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        frame.setLayout(new GridLayout(2,2));

        for(int i = 1; i<=4;i++){
            frame.add(new JButton("Button"+i));
        }

        frame.setVisible(true);
    }
}
