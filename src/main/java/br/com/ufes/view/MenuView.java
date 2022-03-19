
package br.com.ufes.view;


import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;


public class MenuView extends javax.swing.JFrame {

  
    public MenuView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logUserLabel = new javax.swing.JLabel();
        logUserTextField = new javax.swing.JTextField();
        typeUserLabel = new javax.swing.JLabel();
        typeUserTextField = new javax.swing.JTextField();
        notificationsLabel = new javax.swing.JLabel();
        notifyButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        usersInternalFrame = new javax.swing.JInternalFrame();
        usersScrollPane = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        verificarPermissoesButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        novoUsuarioButton = new javax.swing.JButton();
        imagesInternalFrame = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        usersMenu = new javax.swing.JMenu();
        novoUsuarioMenuItem = new javax.swing.JMenuItem();
        listarUsuariosMenuItem = new javax.swing.JMenuItem();
        trocarUsuarioMenuItem = new javax.swing.JMenuItem();
        imagesMenu = new javax.swing.JMenu();
        mostrarMiniMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        sairMenu = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setName("menu"); // NOI18N

        logUserLabel.setText("Usuário Logado: ");

        logUserTextField.setEditable(false);
        logUserTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        logUserTextField.setEnabled(false);
        logUserTextField.setFocusable(false);

        typeUserLabel.setText("Tipo: ");

        typeUserTextField.setEditable(false);
        typeUserTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        typeUserTextField.setEnabled(false);
        typeUserTextField.setFocusable(false);

        notificationsLabel.setText("Notificações:");

        notifyButton.setText("1");

        usersInternalFrame.setTitle("Usuários");
        usersInternalFrame.setMinimumSize(new java.awt.Dimension(1003, 301));
        usersInternalFrame.setName("Usuários"); // NOI18N
        usersInternalFrame.setNormalBounds(new java.awt.Rectangle(0, 0, 1003, 602));
        usersInternalFrame.setPreferredSize(new java.awt.Dimension(1003, 602));
        usersInternalFrame.setVisible(true);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome de Usuário", "Administrador?", "Pode Visualizar", "Pode Excluir", "Pode Compartilhar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usersTable.setColumnSelectionAllowed(true);
        usersScrollPane.setViewportView(usersTable);
        usersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        verificarPermissoesButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verificarPermissoesButton.setText("Verificar Permissões");
        verificarPermissoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarPermissoesButtonActionPerformed(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        excluirButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        novoUsuarioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        novoUsuarioButton.setText("Novo");
        novoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersInternalFrameLayout = new javax.swing.GroupLayout(usersInternalFrame.getContentPane());
        usersInternalFrame.getContentPane().setLayout(usersInternalFrameLayout);
        usersInternalFrameLayout.setHorizontalGroup(
            usersInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInternalFrameLayout.createSequentialGroup()
                .addComponent(usersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(usersInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verificarPermissoesButton)
                    .addGroup(usersInternalFrameLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(usersInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(excluirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novoUsuarioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        usersInternalFrameLayout.setVerticalGroup(
            usersInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInternalFrameLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(verificarPermissoesButton)
                .addGap(8, 8, 8)
                .addComponent(novoUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(usersScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        imagesInternalFrame.setName("Imagens"); // NOI18N
        imagesInternalFrame.setPreferredSize(new java.awt.Dimension(1003, 602));
        imagesInternalFrame.setVisible(false);

        javax.swing.GroupLayout imagesInternalFrameLayout = new javax.swing.GroupLayout(imagesInternalFrame.getContentPane());
        imagesInternalFrame.getContentPane().setLayout(imagesInternalFrameLayout);
        imagesInternalFrameLayout.setHorizontalGroup(
            imagesInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagesInternalFrameLayout.setVerticalGroup(
            imagesInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        usersMenu.setMnemonic('f');
        usersMenu.setText("Usuários");

        novoUsuarioMenuItem.setMnemonic('o');
        novoUsuarioMenuItem.setText("Novo Usuário");
        novoUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(novoUsuarioMenuItem);

        listarUsuariosMenuItem.setMnemonic('s');
        listarUsuariosMenuItem.setText("Listar Usuários");
        listarUsuariosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariosMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(listarUsuariosMenuItem);

        trocarUsuarioMenuItem.setText("Trocar de Usuário");
        trocarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(trocarUsuarioMenuItem);

        menuBar.add(usersMenu);

        imagesMenu.setMnemonic('e');
        imagesMenu.setText("Imagens");
        imagesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagesMenuActionPerformed(evt);
            }
        });

        mostrarMiniMenuItem.setMnemonic('t');
        mostrarMiniMenuItem.setText("Mostrar Miniaturas");
        mostrarMiniMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMiniMenuItemActionPerformed(evt);
            }
        });
        imagesMenu.add(mostrarMiniMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        imagesMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        imagesMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        imagesMenu.add(deleteMenuItem);

        menuBar.add(imagesMenu);

        sairMenu.setMnemonic('h');
        sairMenu.setText("Sair");
        sairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuActionPerformed(evt);
            }
        });

        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        sairMenu.add(sairMenuItem);

        menuBar.add(sairMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usersInternalFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1003, 1003, 1003))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(notificationsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notifyButton))
                    .addComponent(imagesInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagesInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(usersInternalFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logUserLabel)
                    .addComponent(logUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeUserLabel)
                    .addComponent(typeUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notificationsLabel)
                    .addComponent(notifyButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuActionPerformed
        
    }//GEN-LAST:event_sairMenuActionPerformed

    private void novoUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioMenuItemActionPerformed
    
    }//GEN-LAST:event_novoUsuarioMenuItemActionPerformed

    private void trocarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioMenuItemActionPerformed
        
    }//GEN-LAST:event_trocarUsuarioMenuItemActionPerformed

    private void listarUsuariosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuariosMenuItemActionPerformed
     
    }//GEN-LAST:event_listarUsuariosMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void novoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioButtonActionPerformed
   
    }//GEN-LAST:event_novoUsuarioButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
     
    }//GEN-LAST:event_editarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
       
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void verificarPermissoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarPermissoesButtonActionPerformed
       
    }//GEN-LAST:event_verificarPermissoesButtonActionPerformed

    private void mostrarMiniMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMiniMenuItemActionPerformed
      
    }//GEN-LAST:event_mostrarMiniMenuItemActionPerformed

    private void imagesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagesMenuActionPerformed
        
    }//GEN-LAST:event_imagesMenuActionPerformed

   

    public JTextField getLogUserTextField() {
        return logUserTextField;
    }

    public JTextField getTypeUserTextField() {
        return typeUserTextField;
    }

    public JMenu getUsersMenu() {
        return usersMenu;
    }

    public JInternalFrame getUsersInternalFrame() {
        return usersInternalFrame;
    }

    public JTable getUsersTable() {
        return usersTable;
    }

    public JMenuItem getCopyMenuItem() {
        return copyMenuItem;
    }

    public void setCopyMenuItem(JMenuItem copyMenuItem) {
        this.copyMenuItem = copyMenuItem;
    }

    public JMenuItem getDeleteMenuItem() {
        return deleteMenuItem;
    }

    public void setDeleteMenuItem(JMenuItem deleteMenuItem) {
        this.deleteMenuItem = deleteMenuItem;
    }

    public JButton getEditarButton() {
        return editarButton;
    }

    public void setEditarButton(JButton editarButton) {
        this.editarButton = editarButton;
    }

    public JButton getExcluirButton() {
        return excluirButton;
    }

    public void setExcluirButton(JButton excluirButton) {
        this.excluirButton = excluirButton;
    }

    public JInternalFrame getImagesInternalFrame() {
        return imagesInternalFrame;
    }

    public void setImagesInternalFrame(JInternalFrame imagesInternalFrame) {
        this.imagesInternalFrame = imagesInternalFrame;
    }

    public JMenu getImagesMenu() {
        return imagesMenu;
    }

    public void setImagesMenu(JMenu imagesMenu) {
        this.imagesMenu = imagesMenu;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JMenuItem getListarUsuariosMenuItem() {
        return listarUsuariosMenuItem;
    }

    public void setListarUsuariosMenuItem(JMenuItem listarUsuariosMenuItem) {
        this.listarUsuariosMenuItem = listarUsuariosMenuItem;
    }

   
    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public JMenuItem getMostrarMiniMenuItem() {
        return mostrarMiniMenuItem;
    }

    public void setMostrarMiniMenuItem(JMenuItem mostrarMiniMenuItem) {
        this.mostrarMiniMenuItem = mostrarMiniMenuItem;
    }

    public JLabel getNotificationsLabel() {
        return notificationsLabel;
    }

    public void setNotificationsLabel(JLabel notificationsLabel) {
        this.notificationsLabel = notificationsLabel;
    }

    public JButton getNotifyButton() {
        return notifyButton;
    }

    public void setNotifyButton(JButton notifyButton) {
        this.notifyButton = notifyButton;
    }

    public JButton getNovoUsuarioButton() {
        return novoUsuarioButton;
    }

    public void setNovoUsuarioButton(JButton novoUsuarioButton) {
        this.novoUsuarioButton = novoUsuarioButton;
    }

    public JMenuItem getNovoUsuarioMenuItem() {
        return novoUsuarioMenuItem;
    }

    public void setNovoUsuarioMenuItem(JMenuItem novoUsuarioMenuItem) {
        this.novoUsuarioMenuItem = novoUsuarioMenuItem;
    }

    public JMenuItem getPasteMenuItem() {
        return pasteMenuItem;
    }

    public void setPasteMenuItem(JMenuItem pasteMenuItem) {
        this.pasteMenuItem = pasteMenuItem;
    }

    public JMenu getSairMenu() {
        return sairMenu;
    }

    public void setSairMenu(JMenu sairMenu) {
        this.sairMenu = sairMenu;
    }

    public JMenuItem getTrocarUsuarioMenuItem() {
        return trocarUsuarioMenuItem;
    }

    public void setTrocarUsuarioMenuItem(JMenuItem trocarUsuarioMenuItem) {
        this.trocarUsuarioMenuItem = trocarUsuarioMenuItem;
    }

    public JScrollPane getUsersScrollPane() {
        return usersScrollPane;
    }

    public void setUsersScrollPane(JScrollPane usersScrollPane) {
        this.usersScrollPane = usersScrollPane;
    }

    public JButton getVerificarPermissoesButton() {
        return verificarPermissoesButton;
    }

    public void setVerificarPermissoesButton(JButton verificarPermissoesButton) {
        this.verificarPermissoesButton = verificarPermissoesButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JInternalFrame imagesInternalFrame;
    private javax.swing.JMenu imagesMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem listarUsuariosMenuItem;
    private javax.swing.JLabel logUserLabel;
    private javax.swing.JTextField logUserTextField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mostrarMiniMenuItem;
    private javax.swing.JLabel notificationsLabel;
    private javax.swing.JButton notifyButton;
    private javax.swing.JButton novoUsuarioButton;
    private javax.swing.JMenuItem novoUsuarioMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenu sairMenu;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenuItem trocarUsuarioMenuItem;
    private javax.swing.JLabel typeUserLabel;
    private javax.swing.JTextField typeUserTextField;
    private javax.swing.JInternalFrame usersInternalFrame;
    private javax.swing.JMenu usersMenu;
    private javax.swing.JScrollPane usersScrollPane;
    private javax.swing.JTable usersTable;
    private javax.swing.JButton verificarPermissoesButton;
    // End of variables declaration//GEN-END:variables

}
