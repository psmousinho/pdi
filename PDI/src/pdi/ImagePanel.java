/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Pablo Suria
 */
public class ImagePanel extends JPanel {
    
    private BufferedImage currentImage;
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(currentImage != null) {
            g.drawImage(currentImage, 0, 0, null);
        }
    }
    
    public Dimension setImage(BufferedImage image) {
        currentImage = image;
        setSize(currentImage.getWidth(),currentImage.getHeight());
        repaint();
        return this.getSize();
    }
    
    public void clearImage(){
        currentImage = null;
        setSize(615,460);
        repaint();
    }

    public BufferedImage getCurrentImage() {
        return currentImage;
    }

}
