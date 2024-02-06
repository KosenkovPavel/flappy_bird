package org.flappybird.model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Bird extends JPanel {
    private Image image;
    private Integer x = 250;
    private Integer y = 250;

    public Bird(){
        try {
            image = ImageIO.read(Objects.requireNonNull(
                    getClass()
                            .getClassLoader()
                            .getResource("submarine.png"))
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g) {
        g.drawImage(image, x, y, null);
    }


}
