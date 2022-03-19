
package br.com.ufes.view;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginView extends javax.swing.JFrame {

  
    
    public LoginView() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginTitle = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        jtUser = new javax.swing.JTextField();
        jpSenha = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        contaLabel = new javax.swing.JLabel();
        cadastroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setName("Tela de Login"); // NOI18N

        LoginTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LoginTitle.setText("Tela de Login");

        UserLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UserLabel.setText("Usuário:");

        senhaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senhaLabel.setText("Senha:");

        jtUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jpSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginButton.setText("Entrar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        sairButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        contaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contaLabel.setText("Não tem uma Conta?");

        cadastroLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroLabel.setForeground(new java.awt.Color(51, 102, 255));
        cadastroLabel.setText("Cadastre-se!");
        cadastroLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastroLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(LoginTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(senhaLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(loginButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sairButton))
                                    .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroLabel)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LoginTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(jtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(sairButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contaLabel)
                    .addComponent(cadastroLabel))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void cadastroLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLabelMouseEntered
        cadastroLabel.setForeground(new java.awt.Color(51, 255, 51));        
    }//GEN-LAST:event_cadastroLabelMouseEntered

    private void cadastroLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLabelMouseExited
        cadastroLabel.setForeground(new java.awt.Color(51, 102, 255));
    }//GEN-LAST:event_cadastroLabelMouseExited

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cadastroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLabelMouseClicked
        
    }//GEN-LAST:event_cadastroLabelMouseClicked

 

    public JPasswordField getSenhaPasswordField() {
        return jpSenha;
    }

    public JTextField getUserTextField() {
        return jtUser;
    }

    public JLabel getCadastroLabel() {
        return cadastroLabel;
    }

    public void setCadastroLabel(JLabel cadastroLabel) {
        this.cadastroLabel = cadastroLabel;
    }

    public JPasswordField getJpSenha() {
        return jpSenha;
    }

    public void setJpSenha(JPasswordField jpSenha) {
        this.jpSenha = jpSenha;
    }

    public JTextField getJtUser() {
        return jtUser;
    }

    public void setJtUser(JTextField jtUser) {
        this.jtUser = jtUser;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getSairButton() {
        return sairButton;
    }

    public void setSairButton(JButton sairButton) {
        this.sairButton = sairButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel cadastroLabel;
    private javax.swing.JLabel contaLabel;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField jtUser;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
