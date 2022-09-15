/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.JogoController;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Model.Jogo;

/**
 *
 * @author adeli
 */
public class JanelaJogo extends janelaComponentes {

    JogoController jogoController;
    /**
     * Creates new form JanelaJogo
     */
    public JanelaJogo() {
        initComponents();
        jogoController = new JogoController(tabela);
        SliderValueShow(rankingSlider, rankingValueLabel);
        SliderValueShow(horasJogadasSlider, horasJofadasValueLabel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogue = new javax.swing.JDialog();
        rankingSlider = new javax.swing.JSlider();
        rankingValueLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        dialogueButton = new javax.swing.JButton();
        rankingLabel = new javax.swing.JLabel();
        dialogueTitle = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        foiTerminadaLabel = new javax.swing.JLabel();
        foiHistoriaTerminadaCheckbox = new javax.swing.JCheckBox();
        tituloTextField = new javax.swing.JTextField();
        generoTextField1 = new javax.swing.JTextField();
        horasJogadasLabel = new javax.swing.JLabel();
        horasJogadasSlider = new javax.swing.JSlider();
        horasJofadasValueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        deletarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        dialogue.setMinimumSize(new java.awt.Dimension(410, 350));

        rankingSlider.setMaximum(5);

        rankingValueLabel.setText("5");

        tituloLabel.setText("Titulo");

        dialogueButton.setText("Criar");
        dialogueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogueButtonActionPerformed(evt);
            }
        });

        rankingLabel.setText("Ranking");

        dialogueTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dialogueTitle.setText("jLabel2");

        generoLabel.setText("Genêro");

        foiTerminadaLabel.setText("Historia terminada?");

        horasJogadasLabel.setText("Horas Jogadas");

        horasJogadasSlider.setMaximum(5);

        horasJofadasValueLabel.setText("0");

        javax.swing.GroupLayout dialogueLayout = new javax.swing.GroupLayout(dialogue.getContentPane());
        dialogue.getContentPane().setLayout(dialogueLayout);
        dialogueLayout.setHorizontalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogueLayout.createSequentialGroup()
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(foiTerminadaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(foiHistoriaTerminadaCheckbox))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(generoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(generoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(rankingLabel)
                                .addGap(18, 18, 18)
                                .addComponent(rankingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rankingValueLabel))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(tituloLabel)
                                .addGap(18, 18, 18)
                                .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(horasJogadasLabel)
                                .addGap(18, 18, 18)
                                .addComponent(horasJogadasSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(horasJofadasValueLabel))))
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(dialogueTitle))
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(dialogueButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogueLayout.setVerticalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogueLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dialogueTitle)
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloLabel)
                            .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generoLabel)
                            .addComponent(generoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rankingLabel)
                            .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rankingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rankingValueLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(horasJogadasLabel)
                            .addComponent(horasJogadasSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(horasJofadasValueLabel))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foiTerminadaLabel)
                    .addComponent(foiHistoriaTerminadaCheckbox))
                .addGap(28, 28, 28)
                .addComponent(dialogueButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Jogos");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Genêro", "Ranking", "Horas jogadas", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        deletarButton.setBackground(new java.awt.Color(220, 20, 60));
        deletarButton.setForeground(new java.awt.Color(255, 255, 255));
        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        voltarButton.setBackground(new java.awt.Color(220, 20, 60));
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(novoButton)
                                        .addGap(79, 79, 79)
                                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(deletarButton)
                                        .addGap(12, 12, 12)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(voltarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(deletarButton)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton)
                    .addComponent(editarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dialogueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogueButtonActionPerformed
        String titulo = tituloTextField.getText();
        String genero = generoTextField1.getText();
        Integer ranking = rankingSlider.getValue();
        Integer horasJogadas = horasJogadasSlider.getValue();
        boolean foiHistoriaTerminada = foiHistoriaTerminadaCheckbox.isSelected();
        
        Jogo jogo = new Jogo(titulo,genero,ranking, horasJogadas, foiHistoriaTerminada);

                        
        if(dialogueTitle.getText() == "Novo"){
            jogoController.Add(jogo);

        }else{
            jogoController.Edit(jogo);
        }

        dialogue.setVisible(false);
        dialogue.setVisible(false);

    }//GEN-LAST:event_dialogueButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        jogoController.Remove();
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        dialogueTitle.setText("Editar");
        dialogueButton.setText("Editar");
        Jogo jogoEditar = jogoController.loadEdit();
        tituloTextField.setText(jogoEditar.getTitulo());
        generoTextField1.setText(jogoEditar.getGenero());
        rankingSlider.setValue(jogoEditar.getRanking());
        horasJogadasSlider.setValue(jogoEditar.getRanking());
        foiHistoriaTerminadaCheckbox.setSelected(jogoEditar.getFoiHistoriaTerminada());
        dialogue.setVisible(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed

        dialogueTitle.setText("Novo");
        dialogueButton.setText("Novo");
        tituloTextField.setText("");
        generoTextField1.setText("");
        rankingSlider.setValue(5);
        horasJogadasSlider.setValue(0);
        foiHistoriaTerminadaCheckbox.setSelected(false);
        dialogue.setVisible(true);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        VoltarPrincipal();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletarButton;
    private javax.swing.JDialog dialogue;
    private javax.swing.JButton dialogueButton;
    private javax.swing.JLabel dialogueTitle;
    private javax.swing.JButton editarButton;
    private javax.swing.JCheckBox foiHistoriaTerminadaCheckbox;
    private javax.swing.JLabel foiTerminadaLabel;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTextField generoTextField1;
    private javax.swing.JLabel horasJofadasValueLabel;
    private javax.swing.JLabel horasJogadasLabel;
    private javax.swing.JSlider horasJogadasSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoButton;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JSlider rankingSlider;
    private javax.swing.JLabel rankingValueLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
