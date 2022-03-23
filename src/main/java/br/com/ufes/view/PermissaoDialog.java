
package br.com.ufes.view;


public class PermissaoDialog extends javax.swing.JDialog {

   
    public PermissaoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avisoLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        simButton = new javax.swing.JButton();
        naoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        avisoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        avisoLabel.setText("Aviso!");

        msgLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msgLabel.setText("Você não tem Permissão para Esta ação, Gostaria de Solicitar?");

        simButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        simButton.setText("Sim");
        simButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simButtonActionPerformed(evt);
            }
        });

        naoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        naoButton.setText("Não");
        naoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(simButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(naoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(avisoLabel)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(msgLabel)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(avisoLabel)
                .addGap(54, 54, 54)
                .addComponent(msgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simButton)
                    .addComponent(naoButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simButtonActionPerformed
       
    }//GEN-LAST:event_simButtonActionPerformed

    private void naoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoButtonActionPerformed
        
    }//GEN-LAST:event_naoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoLabel;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JButton naoButton;
    private javax.swing.JButton simButton;
    // End of variables declaration//GEN-END:variables
}
