
package br.com.ufes.presenter;


import br.com.ufes.business.imagens.ImagemProxy;
import br.com.ufes.model.Usuario;
import br.com.ufes.util.DeletadorDeImagens;
import br.com.ufes.util.ImagemUtils;
import br.com.ufes.util.ListadorDeImagens;
import br.com.ufes.view.ImagensView;
import br.com.ufes.view.PermissaoDialog;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImagesPresenter {
    private ImagensView view;
    Usuario usuariologado;
    Image imagem;
     

    public ImagesPresenter(Usuario usu) {
        configurarTela();
        this.usuariologado = usu;
        
        view.getVisualizarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                visualizar();
            }  
        });
        view.getCancelButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sair();
            }  
        });
        
        view.getExcluirButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                excluir();
            }  
        });
    } 
    
    public void visualizar(){
        
        if(this.usuariologado.getPermissoes().getVisualizar()){
            imagem = new ImagemProxy(detectarImagemSelecionada()).mostrar(); 
            new ImagemPresenter(imagem);
        }else{
            new PermissaoDialog(this.view,true).setVisible(true);
        }
        
    }
    
    public void sair(){
        view.dispose();
    }
    
    public void excluir(){
        if(this.usuariologado.getPermissoes().getExcluir()){
        Boolean sucesso = DeletadorDeImagens.getInstance().deletar(ImagemUtils.IMG_DIRECTORY+detectarImagemSelecionada());        
        this.view.setImagensList(ListadorDeImagens.getInstance().ListaImagens());
        this.view.dispose();
       
        if(sucesso)
         new JOptionPane().showMessageDialog(new JFrame(),"Imagem Excluida","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            new PermissaoDialog(this.view,true).setVisible(true);
        }
    }
    
    public String detectarImagemSelecionada(){
        JLabel label = null;
        int index = this.view.getImagensList().getSelectedIndex();
          
          JPanel panel = (JPanel)this.view.getImagensList().getCellRenderer().getListCellRendererComponent(this.view.getImagensList(), this.view.getImagensList().getModel().getElementAt(index), index, true, true);
          for(Component comp: panel.getComponents()){
              if ( comp instanceof JLabel )
                  label = (JLabel)comp;
          }
          return label.getText();
    }
    
    private void configurarTela() {
        JList imagens = ListadorDeImagens.getInstance().ListaImagens();
        
        this.view = new ImagensView(imagens);
        this.view.setVisible(true);
        
    }
}
