/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.Locale;

/**
 *
 * @author adeli
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    int saveType = 1; // 0 -> texto, 1 -> binario, 2-> banco de dados
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        SaveTypeDialog.setVisible(true);
        Locale.setDefault(new Locale("pt", "BR"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaveTypeDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        textButton = new javax.swing.JButton();
        binaryText = new javax.swing.JButton();
        filmesButton = new javax.swing.JButton();
        seriesButton = new javax.swing.JButton();
        jogosButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        SaveTypeDialog.setAlwaysOnTop(true);
        SaveTypeDialog.setMinimumSize(new java.awt.Dimension(525, 300));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Como você quer salvar/acessar suas Mídias?");

        textButton.setText("Texto");
        textButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textButtonActionPerformed(evt);
            }
        });

        binaryText.setText("Binário");
        binaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveTypeDialogLayout = new javax.swing.GroupLayout(SaveTypeDialog.getContentPane());
        SaveTypeDialog.getContentPane().setLayout(SaveTypeDialogLayout);
        SaveTypeDialogLayout.setHorizontalGroup(
            SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveTypeDialogLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(SaveTypeDialogLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(textButton)
                        .addGap(100, 100, 100)
                        .addComponent(binaryText)))
                .addGap(88, 88, 88))
        );
        SaveTypeDialogLayout.setVerticalGroup(
            SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveTypeDialogLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textButton)
                    .addComponent(binaryText))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filmesButton.setText("Filmes");
        filmesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesButtonActionPerformed(evt);
            }
        });

        seriesButton.setText("Séries");
        seriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seriesButtonActionPerformed(evt);
            }
        });

        jogosButton.setText("Jogos");
        jogosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogosButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Gerenciador de Mídias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(filmesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seriesButton)
                .addGap(109, 109, 109)
                .addComponent(jogosButton)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmesButton)
                    .addComponent(seriesButton)
                    .addComponent(jogosButton))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filmesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesButtonActionPerformed
        
        JanelaFilme janelaFilme = new JanelaFilme(this.saveType);
        janelaFilme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_filmesButtonActionPerformed

    private void seriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seriesButtonActionPerformed
        JanelaSerie janelaSerie = new JanelaSerie(this.saveType);
        janelaSerie.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_seriesButtonActionPerformed

    private void jogosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogosButtonActionPerformed
       JanelaJogo janelaJogo = new JanelaJogo(this.saveType);
        janelaJogo.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jogosButtonActionPerformed

    private void textButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textButtonActionPerformed
        this.saveType = 0;
        SaveTypeDialog.dispose();
    }//GEN-LAST:event_textButtonActionPerformed

    private void binaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryTextActionPerformed
        this.saveType = 1;
        SaveTypeDialog.dispose();
    }//GEN-LAST:event_binaryTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SaveTypeDialog;
    private javax.swing.JButton binaryText;
    private javax.swing.JButton filmesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jogosButton;
    private javax.swing.JButton seriesButton;
    private javax.swing.JButton textButton;
    // End of variables declaration//GEN-END:variables
}
