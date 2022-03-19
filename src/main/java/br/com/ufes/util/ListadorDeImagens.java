
package br.com.ufes.util;


import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class ListadorDeImagens {    
    private File[] imagens;
    private ArrayList<JPanel> panes = new ArrayList<JPanel>();
    private ListadorDeImagens() {
    }
    
    public static ListadorDeImagens getInstance() {
        return ListadorDeImagensHolder.INSTANCE;
    }
    
    private static class ListadorDeImagensHolder {

        private static final ListadorDeImagens INSTANCE = new ListadorDeImagens();
    }
    
    
    public JList ListaImagens(){
        panes.clear();
        File directoryPath = new File(ImagemUtils.IMG_DIR);
        //List of all files and directories
        imagens = directoryPath.listFiles();
         
        // construct the menuList as a JList
        JList menuList = new JList();
        menuList.setCellRenderer(new ImageListCellRenderer());
        
                
        for(int i = 0; i<imagens.length; i++){
            Icon icone = null;
            try {
                icone = RedimensionadorDeImagens.getInstance().redimensiona(imagens[i]);
            } catch (IOException ex) {
                Logger.getLogger(ListadorDeImagens.class.getName()).log(Level.SEVERE, null, ex);
            }
            JLabel label = new JLabel(imagens[i].getName(), icone, JLabel.LEFT);
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            panel.add(label);
            panes.add(panel);
        }
        
        Object[] panels = panes.toArray();
        
        menuList.setListData(panels);
        return menuList;
    }

}
