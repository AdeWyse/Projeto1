/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import Model.Filme;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class FilmeController extends FileController{

    ArrayList<Filme> filmeList;
    public FilmeController(JTable table) {
        super(table);
        filmeList = new ArrayList<Filme>();
        if(arquivo.exists()){
            List(this.table);
            ConverterDeString(Ler());
        }
    }

    
    
    @Override
    public String ConverterParaString() {
        String converted = "";
        for(int i= 0; i< filmeList.size(); i++){
            converted = converted + filmeList.get(i).toString();
                        converted = converted + "\n";
        }
        return converted;
    }

    @Override
    public void ConverterDeString(String conteudo) {
        String titulo;
        String genero;
        Integer ranking;
        boolean foiAssistido;
        
        StringTokenizer tokenizer = new StringTokenizer(conteudo, "\n");
        
        int size = tokenizer.countTokens();
        for(int i = 1; i <= size; i++){
            String token = tokenizer.nextToken();
            String[] dados = token.split(",");
            titulo = dados[0];
            genero = dados[1];
            ranking = Integer.valueOf(dados[2]);
            if(dados[3].equals("true")){

                foiAssistido = true;
            }else{
                foiAssistido = false;
            }
            
            Filme filme = new Filme(titulo, genero, ranking, foiAssistido);
            filmeList.add(filme);
        }
        List(table);
        
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "filme.txt";
    }
    
    // @override
    public void Add(Filme filme){
        filmeList.add(filme);
       EscreverListar();
    }
    
   @Override
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Filme filmeRemover = filmeList.get(index);
        filmeList.remove(filmeRemover);
        EscreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       for(int i = 0; i < filmeList.size(); i++){
           String titulo = filmeList.get(i).getTitulo();
           String genero = filmeList.get(i).getGenero();
           Integer ranking = filmeList.get(i).getRanking();
           Boolean foiAssistido = filmeList.get(i).getFoiAssistido();
           
           Object[] data = {titulo, genero, ranking, foiAssistido};
           
         model.addRow(data);
       }
    }
    
   // @Override
    public void Edit(Filme filmeEditar){
        Integer index = this.table.getSelectedRow();
        filmeList.get(index).setTitulo(filmeEditar.getTitulo());
        filmeList.get(index).setGenero(filmeEditar.getGenero());
        filmeList.get(index).setRanking(filmeEditar.getRanking());
        filmeList.get(index).setFoiAssistido(filmeEditar.getFoiAssistido());
        EscreverListar();
    }
    
    
    public Filme loadEdit(){
        Integer index = this.table.getSelectedRow();
        return filmeList.get(index);
    }
    
    public void Pesquisar(String input){
        //Pesquisa(input, filmeList);
    }
        
}
