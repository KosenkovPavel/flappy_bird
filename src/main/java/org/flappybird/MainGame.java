package org.flappybird;

import lombok.var;
import org.flappybird.model.Bird;
import org.flappybird.util.KeyBoardListener;

import javax.swing.*;

public class MainGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        var bird = new Bird();

        frame.add(bird);
        frame.addKeyListener(new KeyBoardListener());
        frame.setVisible(true);
    }
}
