/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Midia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public abstract class FileController {

    protected File arquivo;
    protected String arquivoPath;
    protected String arquivoNome;
    protected JTable table;


   // public abstract void Add();
    
   public abstract void Remove();
     
  //  public abstract void Edit();
    
    public abstract void List(JTable table);
    
    public abstract String ConverterParaString();

    public abstract void ConverterDeString(String conteudo);

    public abstract void setArquivoNome();
    
     public abstract void Pesquisa(String nome);

    public FileController(JTable table) {

        setArquivoNome();
        getPath();
        arquivo = new File(arquivoPath+ "\\" + this.arquivoNome);
        this.table = table;
    }

    public void getPath() {
        String arquivoPathTemp = System.getProperty(("user.dir"));
        arquivoPath = arquivoPathTemp + "\\src\\Arquivos";
        
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
    
   

    public void Pesquisa(String name, ArrayList<Midia> midiaList){
       
        for(int i = 0; i < midiaList.size(); i++){
           if(midiaList.get(i).getTitulo().contains(name)){
               this.table.setRowSelectionInterval(i-1, i);
           }
       }
    }
}
