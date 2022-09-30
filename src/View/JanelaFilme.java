/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.BinaryControllers.BinaryFilmeController;
import Controller.TextControllers.TextFilmeController;
import Model.Filme;

/**
 *
 * @author adeli
 */
public class JanelaFilme extends janelaComponentes {

    int saveType;
    BinaryFilmeController filmeBinaryController;
    TextFilmeController filmeTextController;

    /**
     * Creates new form JanelaFilme
     */
    public JanelaFilme(int savetype) {
        initComponents();
        this.saveType = savetype;
        switch (saveType) {
            case 0:
                filmeTextController = new TextFilmeController(tabela);
                break;
            case 1:
                filmeBinaryController = new BinaryFilmeController(tabela);
                break;
            default:
                break;
        }

        SliderValueShow(rankingSlider, rankingValueLabel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogue = new javax.swing.JFrame();
        rankingSlider = new javax.swing.JSlider();
        rankingValueLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        dialogueButton = new javax.swing.JButton();
        rankingLabel = new javax.swing.JLabel();
        dialogueTitle = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        foiAssistidoLabel = new javax.swing.JLabel();
        foiAssistidoCheckbox = new javax.swing.JCheckBox();
        tituloTextField = new javax.swing.JTextField();
        generoTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        novoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        buscaInput = new javax.swing.JTextField();
        buscaButton = new javax.swing.JButton();

        dialogue.setMinimumSize(new java.awt.Dimension(400, 479));

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

        foiAssistidoLabel.setText("Foi assistido?");

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
                                .addComponent(foiAssistidoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(foiAssistidoCheckbox))
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
                                .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(dialogueButton))
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(dialogueTitle)))
                .addContainerGap(48, Short.MAX_VALUE))
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
                            .addComponent(rankingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rankingValueLabel))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foiAssistidoLabel)
                    .addComponent(foiAssistidoCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(dialogueButton)
                .addGap(41, 41, 41))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Filmes");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Genêro", "Ranking", "Assistido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        deletarButton.setBackground(new java.awt.Color(220, 20, 60));
        deletarButton.setForeground(new java.awt.Color(255, 255, 255));
        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
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

        buscaButton.setText("Buscar");
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214)
                        .addComponent(voltarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(deletarButton)
                                .addGap(75, 75, 75))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(novoButton)
                                .addGap(79, 79, 79)
                                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscaButton)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(voltarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletarButton)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton)
                    .addComponent(editarButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed

        dialogueTitle.setText("Novo");
        dialogueButton.setText("Novo");
        tituloTextField.setText("");
        generoTextField1.setText("");
        rankingSlider.setValue(5);
        foiAssistidoCheckbox.setSelected(false);
        dialogue.setVisible(true);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void dialogueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogueButtonActionPerformed
        String titulo = tituloTextField.getText();
        String genero = generoTextField1.getText();
        int ranking = rankingSlider.getValue();
        boolean foiAssistido = foiAssistidoCheckbox.isSelected();

        Filme filme = new Filme(titulo, genero, ranking, foiAssistido);

        switch (this.saveType) {
            case 0:
                if (dialogueTitle.getText() == "Novo") {
                    filmeTextController.Add(filme);

                } else {
                    filmeTextController.Edit(filme);
                }
                break;
            case 1:
                if (dialogueTitle.getText() == "Novo") {
                    filmeBinaryController.Add(filme);

                } else {
                    filmeBinaryController.Edit(filme);
                }
                break;
            default:
                break;
        }

        dialogue.setVisible(false);

    }//GEN-LAST:event_dialogueButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        dialogueTitle.setText("Editar");
        dialogueButton.setText("Editar");
        Filme filmeEditar = new Filme("","",0,false);
        switch (this.saveType) {
            case 0:
                filmeEditar = filmeTextController.loadEdit();
                break;
            case 1:
                filmeEditar = filmeBinaryController.loadEdit();
                break;
            default:
                break;
        }
        
        tituloTextField.setText(filmeEditar.getTitulo());
        generoTextField1.setText(filmeEditar.getGenero());
        rankingSlider.setValue(filmeEditar.getRanking());
        foiAssistidoCheckbox.setSelected(filmeEditar.getFoiAssistido());
        dialogue.setVisible(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
       switch (this.saveType) {
            case 0:
                 filmeTextController.Remove();
                break;
            case 1:
                 filmeBinaryController.Remove();
                break;
            default:
                break;
        }
       
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        VoltarPrincipal();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
        switch (this.saveType) {
            case 0:
                 filmeTextController.Pesquisa(buscaInput.getText());;
                break;
            case 1:
                 filmeBinaryController.Pesquisa(buscaInput.getText());;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_buscaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new JanelaFilme(this.saveType).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaButton;
    private javax.swing.JTextField buscaInput;
    private javax.swing.JButton deletarButton;
    private javax.swing.JFrame dialogue;
    private javax.swing.JButton dialogueButton;
    private javax.swing.JLabel dialogueTitle;
    private javax.swing.JButton editarButton;
    private javax.swing.JCheckBox foiAssistidoCheckbox;
    private javax.swing.JLabel foiAssistidoLabel;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTextField generoTextField1;
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
