/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import Model.Serie;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class SerieController extends FileBinaryController{

    ArrayList<Serie> serieList;
    
    public SerieController(JTable table) {
        super(table);
        serieList = new ArrayList<Serie>();
        if(arquivo.exists()){
            List(this.table);
            ConverterDeString(Ler());
        }
    }

    
    
    @Override
    public String ConverterParaString() {
        String converted = "";
        for(int i= 0; i< serieList.size(); i++){
            converted = converted + serieList.get(i).toString();
                        converted = converted + "\n";
        }
        return converted;
    }

    @Override
    public void ConverterDeString(String conteudo) {
        String titulo;
        String genero;
        Integer ranking;
        Integer numEpisodios;
        Integer numEpisodiosAssistidos;
        
        StringTokenizer tokenizer = new StringTokenizer(conteudo, "\n");
        
        int size = tokenizer.countTokens();
        for(int i = 1; i <= size; i++){
            String token = tokenizer.nextToken();
            String[] dados = token.split(",");
            titulo = dados[0];
            genero = dados[1];
            ranking = Integer.valueOf(dados[2]);
            numEpisodios = Integer.valueOf(dados[3]);
            numEpisodiosAssistidos = Integer.valueOf(dados[4]);
            
            Serie serie = new Serie(titulo, genero, ranking, numEpisodios, numEpisodiosAssistidos);
            serieList.add(serie);
        }
        List(table);
        
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "serie.txt";
    }
    
    // @override
    public void Add(Serie serie){
        serieList.add(serie);
       EscreverListar();
    }
    
   @Override
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Serie serieRemover = serieList.get(index);
        serieList.remove(serieRemover);
        EscreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       for(int i = 0; i < serieList.size(); i++){
           String titulo = serieList.get(i).getTitulo();
           String genero = serieList.get(i).getGenero();
           Integer ranking = serieList.get(i).getRanking();
           Integer numEpisodios = serieList.get(i).getNumEpisodios();
           Integer numEpisodiosAssistidos = serieList.get(i).getNumEpisodiosAssistidos();
           
           Object[] data = {titulo, genero, ranking, numEpisodios, numEpisodiosAssistidos};
           
         model.addRow(data);
       }
    }
    
   // @Override
    public void Edit(Serie serieEditar){
        Integer index = this.table.getSelectedRow();
        serieList.get(index).setTitulo(serieEditar.getTitulo());
        serieList.get(index).setGenero(serieEditar.getGenero());
        serieList.get(index).setRanking(serieEditar.getRanking());
        serieList.get(index).setNumEpisodios(serieEditar.getNumEpisodios());
        serieList.get(index).setNumEpisodiosAssistidos(serieEditar.getNumEpisodiosAssistidos());
        EscreverListar();
    }
    
    
    public Serie loadEdit(){
        Integer index = this.table.getSelectedRow();
        return serieList.get(index);
    }
        
    public void Pesquisa(String name){
        for(int i = 0; i <serieList.size(); i++){
           if(serieList.get(i).getTitulo().contains(name)){
               this.table.setRowSelectionInterval(i, i);
               return;
           }
       }
    }
}
