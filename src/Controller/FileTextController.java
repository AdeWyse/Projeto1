/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author UTFPR
 */
public abstract class FileTextController extends FileController{
    
        

     public abstract void Pesquisa(String nome);
     public abstract void List(JTable table);
     public abstract void Remove();
     public abstract String ConverterParaString();
    public abstract void ConverterDeString(String conteudo);
    
    public FileTextController(JTable table) {
        super(table);
    }

    public String Ler() {
        String conteudo = "";
        if (arquivo.exists()) {
            StringBuilder conteudoBuilder = new StringBuilder();

            try ( BufferedReader reader = new BufferedReader(new FileReader(arquivo.getPath()))) {
                String linhaAtual;
                while ((linhaAtual = reader.readLine()) != null) {
                    conteudoBuilder.append(linhaAtual).append("\n");
                }
            } catch (IOException e) {
            }
            conteudo = conteudoBuilder.toString();
        }
        return conteudo;
    }

    public void Escrever(String conteudo)
            throws IOException {
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(arquivo, false);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.append(conteudo);
        writer.close();
    }
    
    public void EscreverListar(){
        try{
            Escrever(ConverterParaString());
        }catch(IOException e){
            System.out.println("Erro");
        }
         List(this.table);
    }
}
