/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Pablo Suria
 */
public class ImageManager {

    public static BufferedImage loadImage(File imageFile) {

        try {
            BufferedImage image = ImageIO.read(imageFile);
            if (image == null || (image.getWidth(null) < 0)) {
                // we could not load the image - probably invalid file format
                return null;
            }
            return image;
        } catch (IOException exc) {
            return null;
        }
    }

    public static void saveImage(BufferedImage image, File file) {
        try {
            ImageIO.write(image, "jpg", file);
        } catch (IOException exc) {
            return;
        }
    }

}
