package org.flappybird;

import javax.swing.*;

public class MainLayoutIssues {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);
        frame.add(panel);

        frame.setVisible(true);
    }
}
