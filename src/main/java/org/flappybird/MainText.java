package org.flappybird;

import javax.swing.*;

public class MainText {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JTextField textField = new JTextField();
        frame.add(textField);

        frame.setVisible(true);
    }
}
