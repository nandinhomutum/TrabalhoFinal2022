
package br.com.ufes.business.imagens;

import br.com.ufes.util.ImagemUtils;
import br.com.ufes.util.RedimensionadorDeImagens;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class ImagemProxy implements Imagem{
   private ImagemReal realImage;
   private String fileName;
   
   public ImagemProxy(String fileName){
      this.fileName = ImagemUtils.IMG_DIR+"\\"+fileName;
   }

    @Override
    public Image mostrar() {
        if(realImage == null){
            try {
                realImage = new ImagemReal(fileName);
            } catch (IOException ex) {
                Logger.getLogger(ImagemProxy.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      return realImage.mostrar();
    }
    
    public ImageIcon mostraProxy() throws IOException{
        File imagem = new File(this.fileName);
        return RedimensionadorDeImagens.getInstance().redimensiona(imagem);
    }
    
}
