
package br.com.ufes.presenter;


import br.com.ufes.view.ImagemView;
import java.awt.Image;


public class ImagemPresenter {
    private ImagemView view;

    public ImagemPresenter(Image imagem) {
        configurarTela();
    }
    private void configurarTela() {
        this.view = new ImagemView();
        this.view.setVisible(true);
    }
}
