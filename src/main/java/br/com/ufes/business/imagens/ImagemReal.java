
package br.com.ufes.business.imagens;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImagemReal implements Imagem {
    private String path;
    private Image img;

    public ImagemReal(String fileName) throws IOException {
        this.path = fileName;       
        this.img = loadFromDisk();
    } 
    
   @Override
   public Image mostrar() {
       return this.img;
   }
   
   private Image loadFromDisk() throws IOException{
     
      Image img = ImageIO.read(new File(path));      
      System.out.println("Loading " + path);
      return img;
   }
}
