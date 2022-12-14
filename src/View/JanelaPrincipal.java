/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.Locale;
import Controller.BDController;


/**
 *
 * @author adeli
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    int saveType = 1; // 0 -> texto, 1 -> binario, 2-> banco de dados
    int janelaEscolha = 0;
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        if(janelaEscolha == 0){
           SaveTypeDialog.setVisible(true);
           janelaEscolha++;

        }
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
        binaryText1 = new javax.swing.JButton();
        seriesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filmesButton = new javax.swing.JButton();
        jogosButton = new javax.swing.JButton();
        escolhaButton = new javax.swing.JButton();

        SaveTypeDialog.setAlwaysOnTop(true);
        SaveTypeDialog.setMinimumSize(new java.awt.Dimension(400, 278));
        SaveTypeDialog.setPreferredSize(new java.awt.Dimension(400, 234));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Como você quer salvar/acessar suas Mídias?");

        textButton.setBackground(new java.awt.Color(255, 204, 153));
        textButton.setText("Texto");
        textButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textButtonActionPerformed(evt);
            }
        });

        binaryText.setBackground(new java.awt.Color(255, 204, 153));
        binaryText.setText("Binário");
        binaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryTextActionPerformed(evt);
            }
        });

        binaryText1.setBackground(new java.awt.Color(255, 204, 153));
        binaryText1.setText("Banco de Dados");
        binaryText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryText1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveTypeDialogLayout = new javax.swing.GroupLayout(SaveTypeDialog.getContentPane());
        SaveTypeDialog.getContentPane().setLayout(SaveTypeDialogLayout);
        SaveTypeDialogLayout.setHorizontalGroup(
            SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveTypeDialogLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(SaveTypeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(SaveTypeDialogLayout.createSequentialGroup()
                        .addComponent(textButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(binaryText)
                        .addGap(37, 37, 37)
                        .addComponent(binaryText1))
                    .addComponent(jLabel2))
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
                    .addComponent(binaryText)
                    .addComponent(binaryText1))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 234));
        setPreferredSize(new java.awt.Dimension(400, 234));

        seriesButton.setBackground(new java.awt.Color(153, 0, 153));
        seriesButton.setForeground(new java.awt.Color(255, 255, 255));
        seriesButton.setText("Séries");
        seriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seriesButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gerenciador de Mídias");

        filmesButton.setBackground(new java.awt.Color(0, 153, 51));
        filmesButton.setForeground(new java.awt.Color(255, 255, 255));
        filmesButton.setText("Filmes");
        filmesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesButtonActionPerformed(evt);
            }
        });

        jogosButton.setBackground(new java.awt.Color(0, 153, 153));
        jogosButton.setForeground(new java.awt.Color(255, 255, 255));
        jogosButton.setText("Jogos");
        jogosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogosButtonActionPerformed(evt);
            }
        });

        escolhaButton.setText("Escolha");
        escolhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filmesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seriesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jogosButton))
                    .addComponent(jLabel1))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escolhaButton)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seriesButton)
                    .addComponent(filmesButton)
                    .addComponent(jogosButton))
                .addGap(38, 38, 38)
                .addComponent(escolhaButton)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seriesButtonActionPerformed
        JanelaSerie janelaSerie = new JanelaSerie(this.saveType, this);
        janelaSerie.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_seriesButtonActionPerformed

    private void textButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textButtonActionPerformed
        this.saveType = 0;
        SaveTypeDialog.dispose();
    }//GEN-LAST:event_textButtonActionPerformed

    private void binaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryTextActionPerformed
        this.saveType = 1;
        SaveTypeDialog.dispose();
    }//GEN-LAST:event_binaryTextActionPerformed

    private void binaryText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryText1ActionPerformed
        this.saveType = 2;
        SaveTypeDialog.dispose();
    }//GEN-LAST:event_binaryText1ActionPerformed

    private void filmesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesButtonActionPerformed
       JanelaFilme janelaFilme = new JanelaFilme(this.saveType, this);
        janelaFilme.setVisible(true);
      //  this.setVisible(false);
    }//GEN-LAST:event_filmesButtonActionPerformed

    private void jogosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogosButtonActionPerformed
        JanelaJogo janelaJogo = new JanelaJogo(this.saveType, this);
        janelaJogo.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jogosButtonActionPerformed

    private void escolhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaButtonActionPerformed
        SaveTypeDialog.setVisible(true);
    }//GEN-LAST:event_escolhaButtonActionPerformed

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
    private javax.swing.JButton binaryText1;
    private javax.swing.JButton escolhaButton;
    private javax.swing.JButton filmesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jogosButton;
    private javax.swing.JButton seriesButton;
    private javax.swing.JButton textButton;
    // End of variables declaration//GEN-END:variables
}
