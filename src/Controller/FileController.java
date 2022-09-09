/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author adeli
 */
public abstract class FileController {

    protected File arquivo;
    protected String conteudo;
    protected String arquivoPath;
    protected String arquivoNome;

    public abstract String ConverterParaString();

    public abstract void ConverterDeString();

    public abstract void setArquivoNome();

    public FileController() {

        setArquivoNome();
        getPath();
        arquivo = new File(arquivoPath);
        conteudo = "Teste";
    }

    public void getPath() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File pastaSelecionada = chooser.getCurrentDirectory();
            arquivoPath = pastaSelecionada.getAbsolutePath().toString() + this.arquivoNome;
        }
    }

    public String Ler() {
        if (arquivo.exists()) {
            StringBuilder conteudoBuilder = new StringBuilder();

            try ( BufferedReader reader = new BufferedReader(new FileReader(arquivo.getPath()))) {
                String linhaAtual;
                while ((linhaAtual = reader.readLine()) != null) {
                    conteudoBuilder.append(linhaAtual).append("\n");
                }
            } catch (IOException e) {

            }
            this.conteudo = conteudoBuilder.toString();
        }

        System.out.printf(this.conteudo);
        return this.conteudo;
    }

    public void Escrever()
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo.getName(), true));
        writer.append(this.conteudo);
        writer.close();
    }

}
