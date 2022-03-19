
package br.com.ufes.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;


class ImageComponent extends JComponent{
    private static final long serialVersionUID = 1L;
    private Image image;
    public ImageComponent(Image image){
        this.image=image;
       // this.image = this.image.getScaledInstance(500, 333, 500);
    }
    @Override
    public void paintComponent (Graphics g){
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);

        g.drawImage(image, 50, 50, this);
        System.out.println("Exibindo Imagem");
        
        /*
        for (int i = 0; i*imageWidth <= getWidth(); i++)
            for(int j = 0; j*imageHeight <= getHeight();j++)
                if(i+j>0) g.copyArea(0, 0, imageWidth, imageHeight, i*imageWidth, j*imageHeight);*/
    }
}
