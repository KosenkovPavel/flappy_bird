package org.flappybird;

import javax.swing.*;

public class MainPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400 ,400);

        JButton button = new JButton("Click me!");
        JTextField textField = new JTextField();

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(textField);

        frame.add(panel);

        frame.setVisible(true);
    }
}
