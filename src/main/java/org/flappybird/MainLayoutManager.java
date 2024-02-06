package org.flappybird;

import javax.swing.*;
import java.awt.*;

public class MainLayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");

        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
