
package br.com.ufes.presenter;


import br.com.ufes.view.ImagemView;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ImagemPresenter {
    private ImagemView view;

    public ImagemPresenter(Image imagem) {
        configurarTela(imagem);
    }
    private void configurarTela(Image imagem) {
        this.view = new ImagemView();
        this.view.setVisible(true);
        ImageIcon imagemIcon = new ImageIcon(imagem);
        this.view.getImagemExibir().setIcon(imagemIcon);
    }
}
