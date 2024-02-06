package org.flappybird;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");

        fileMenu.add(openItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
