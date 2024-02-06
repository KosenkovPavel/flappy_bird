package org.flappybird;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainManagingEventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
