
package br.com.ufes.util;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class RedimensionadorDeImagens {
    
    ImageIcon image;
    
    private RedimensionadorDeImagens() {
    }
    
    public static RedimensionadorDeImagens getInstance() {
        return RedimensionadorDeImagensHolder.INSTANCE;
    }
    
    private static class RedimensionadorDeImagensHolder {

        private static final RedimensionadorDeImagens INSTANCE = new RedimensionadorDeImagens();
    }
    
  public BufferedImage scale(BufferedImage source,double ratio) {
  int w = (int) (source.getWidth() * ratio);
  int h = (int) (source.getHeight() * ratio);
  BufferedImage bi = getCompatibleImage(w, h);
  Graphics2D g2d = bi.createGraphics();
  double xScale = (double) w / source.getWidth();
  double yScale = (double) h / source.getHeight();
  AffineTransform at = AffineTransform.getScaleInstance(xScale,yScale);
  g2d.drawRenderedImage(source, at);
  g2d.dispose();
  return bi;
}

private BufferedImage getCompatibleImage(int w, int h) {
  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
  GraphicsDevice gd = ge.getDefaultScreenDevice();
  GraphicsConfiguration gc = gd.getDefaultConfiguration();
  BufferedImage image = gc.createCompatibleImage(w, h);
  return image;
}

public ImageIcon redimensiona(File file) throws IOException{   
    if (file.isFile()) {
   Image baseImage = ImageIO.read(file);
   Image scaledImage = baseImage.getScaledInstance(85, 100,  java.awt.Image.SCALE_SMOOTH);   
   image = new ImageIcon(scaledImage);
    }   
    return image;    
}

}
