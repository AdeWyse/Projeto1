/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.BinaryControllers.BinarySerieController;
import Controller.DBControllers.SerieDAO;
import Controller.TextControllers.TextSerieController;
import Model.Serie;
import javax.swing.JOptionPane;

/**
 *
 * @author adeli
 */
public class JanelaSerie extends janelaComponentes {

    int saveType;
    JanelaPrincipal janelaPrincipal;
    BinarySerieController serieBinaryController;
    TextSerieController serieTextController;
    SerieDAO serieDAO;

    /**
     * Creates new form JanelaSerie
     */
    public JanelaSerie(int saveType, JanelaPrincipal janelaPrincipal) {
        initComponents();
        this.saveType = saveType;
        this.janelaPrincipal = janelaPrincipal;
        switch (saveType) {
            case 0:
                serieTextController = new TextSerieController(tabela);
                break;
            case 1:
                serieBinaryController = new BinarySerieController(tabela);
                break;
            case 2:
                serieDAO = new SerieDAO(tabela);
                break;
            default:
                break;
        }
        SliderValueShow(rankingSlider, rankingValueLabel);
        SliderValueShowWithLimit(numEpisodesSlider, numEpisodiosValue, assistidosSlider);
        SliderValueShow(assistidosSlider, assistidosValue);
        System.out.print(numEpisodesSlider.getValue());

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
        numEpisodesSlider = new javax.swing.JSlider();
        numEpisodiosValue = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        dialogueButton = new javax.swing.JButton();
        rankingLabel = new javax.swing.JLabel();
        dialogueTitle = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        generoTextField1 = new javax.swing.JTextField();
        numEpisodesLabel = new javax.swing.JLabel();
        assistidosLabel = new javax.swing.JLabel();
        rankingSlider = new javax.swing.JSlider();
        rankingValueLabel = new javax.swing.JLabel();
        assistidosSlider = new javax.swing.JSlider();
        assistidosValue = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        editarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        buscaButton = new javax.swing.JButton();
        buscaInput = new javax.swing.JTextField();

        dialogue.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogue.setMinimumSize(new java.awt.Dimension(500, 450));

        numEpisodesSlider.setMajorTickSpacing(200);
        numEpisodesSlider.setMaximum(200);
        numEpisodesSlider.setMinimum(1);

        numEpisodiosValue.setText("1");

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

        generoLabel.setText("Gen??ro");

        numEpisodesLabel.setText("N??mero de epis??dios");

        assistidosLabel.setText("Epis??dios assistidos");

        rankingSlider.setMaximum(5);

        rankingValueLabel.setText("5");

        assistidosSlider.setMajorTickSpacing(200);
        assistidosSlider.setMaximum(200);
        assistidosSlider.setValue(0);

        assistidosValue.setText("0");

        idLabel.setText("Id");

        idValue.setText("0");

        javax.swing.GroupLayout dialogueLayout = new javax.swing.GroupLayout(dialogue.getContentPane());
        dialogue.getContentPane().setLayout(dialogueLayout);
        dialogueLayout.setHorizontalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogueLayout.createSequentialGroup()
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(dialogueTitle))
                    .addGroup(dialogueLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(generoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(generoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(tituloLabel)
                                .addGap(18, 18, 18)
                                .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rankingLabel)
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(rankingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rankingValueLabel))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(assistidosLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(assistidosSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(assistidosValue))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(numEpisodesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numEpisodesSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numEpisodiosValue))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(dialogueButton))
                            .addGroup(dialogueLayout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addGap(18, 18, 18)
                                .addComponent(idValue)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        dialogueLayout.setVerticalGroup(
            dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogueLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dialogueTitle)
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idValue))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel)
                    .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoLabel)
                    .addComponent(generoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rankingLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rankingSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingValueLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numEpisodesLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogueLayout.createSequentialGroup()
                        .addComponent(numEpisodesSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(numEpisodiosValue, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assistidosLabel)
                    .addGroup(dialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogueLayout.createSequentialGroup()
                            .addComponent(assistidosSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))
                        .addComponent(assistidosValue, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addComponent(dialogueButton)
                .addGap(63, 63, 63))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Series");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Gen??ro", "Ranking", "Epis??dios", "Assistidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setSelectionBackground(new java.awt.Color(153, 0, 153));
        tabela.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabela);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(271, 271, 271)
                        .addComponent(voltarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(novoButton)
                                        .addGap(79, 79, 79)
                                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(deletarButton)
                                        .addGap(12, 12, 12)))
                                .addGap(76, 76, 76))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(voltarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarButton)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton)
                    .addComponent(editarButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dialogueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogueButtonActionPerformed
        Object[] opcoes = {"Sim", "N??o"}; 
        int optionPane =  JOptionPane.showOptionDialog(this,"Tem certeza?","Tem certeza?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
      if(optionPane == 0){
        Integer id = Integer.parseInt(idValue.getText());
        String titulo = tituloTextField.getText();
        String genero = generoTextField1.getText();
        int ranking = rankingSlider.getValue();
        int numEpisodes = numEpisodesSlider.getValue();
        int numAssistidos = assistidosSlider.getValue();

        Serie serie = new Serie(id, titulo, genero, ranking, numEpisodes, numAssistidos);

        switch (saveType) {
            case 0:
                if (dialogueTitle.getText() == "Novo") {
                    serieTextController.Add(serie);

                } else {
                    serieTextController.Edit(serie);
                }
                break;
            case 1:
                if (dialogueTitle.getText() == "Novo") {
                    serieBinaryController.Add(serie);

                } else {
                    serieBinaryController.Edit(serie);
                }
                break;
            case 2:
                if (dialogueTitle.getText() == "Novo") {
                    serieDAO.Insert(serie);

                } else {
                    
                    serieDAO.Edit(serie);
                }
                break;
            default:
                break;
        }

        dialogue.setVisible(false);
      }

    }//GEN-LAST:event_dialogueButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        dialogueTitle.setText("Editar");
        dialogueButton.setText("Editar");
        Serie serieEditar = new Serie(0,"", "", 0, 0, 0);
        switch (this.saveType) {
            case 0:
                serieEditar = serieTextController.loadEdit();
                break;
            case 1:
                serieEditar = serieBinaryController.loadEdit();
                break;
             case 2:
                serieEditar = serieDAO.loadEdit();
                break;
            default:
                break;
        }
        
        idValue.setText(serieEditar.getId().toString());
        tituloTextField.setText(serieEditar.getTitulo());
        generoTextField1.setText(serieEditar.getGenero());
        rankingSlider.setValue(serieEditar.getRanking());
        numEpisodesSlider.setValue(serieEditar.getNumEpisodios());
        assistidosSlider.setValue(serieEditar.getNumEpisodiosAssistidos());
        dialogue.setVisible(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        Object[] opcoes = {"Sim", "N??o"}; 
        int optionPane =  JOptionPane.showOptionDialog(this,"Tem certeza de que quer excluir essa S??rie?","Excluir?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
      if(optionPane == 0){
        switch (this.saveType) {
            case 0:
                serieTextController.Remove();
                break;
            case 1:
                serieBinaryController.Remove();
                break;
            case 2:
                 serieDAO.Remove();
                break;
            default:
                break;
        }
      }
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed

        dialogueTitle.setText("Novo");
        dialogueButton.setText("Novo");
        tituloTextField.setText("");
        generoTextField1.setText("");
        rankingSlider.setValue(5);
        numEpisodesSlider.setValue(1);
        assistidosSlider.setValue(0);
        dialogue.setVisible(true);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        VoltarPrincipal(janelaPrincipal);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
        switch (this.saveType) {
            case 0:
                serieTextController.Pesquisa(buscaInput.getText());
                break;
            case 1:
                serieBinaryController.Pesquisa(buscaInput.getText());
                break;
            case 2:
                 serieDAO.Pesquisa(buscaInput.getText());
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
            java.util.logging.Logger.getLogger(JanelaSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JanelaSerie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assistidosLabel;
    private javax.swing.JSlider assistidosSlider;
    private javax.swing.JLabel assistidosValue;
    private javax.swing.JButton buscaButton;
    private javax.swing.JTextField buscaInput;
    private javax.swing.JButton deletarButton;
    private javax.swing.JDialog dialogue;
    private javax.swing.JButton dialogueButton;
    private javax.swing.JLabel dialogueTitle;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTextField generoTextField1;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoButton;
    private javax.swing.JLabel numEpisodesLabel;
    private javax.swing.JSlider numEpisodesSlider;
    private javax.swing.JLabel numEpisodiosValue;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JSlider rankingSlider;
    private javax.swing.JLabel rankingValueLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
