/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.TextControllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import Model.Serie;
import Model.SerieUtiltario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class TextSerieController extends FileTextController{

    ArrayList<Serie> serieList;
    
    public TextSerieController(JTable table) {
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
        serieList = SerieUtiltario.Add(serie, serieList);
       escreverListar();
    }
    
    public void Remove(){
        serieList = SerieUtiltario.Remove(serieList, this.table);
        escreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
       SerieUtiltario.List(serieList, this.table);
    }
    
   // @Override
    public void Edit(Serie serieEditar){
       SerieUtiltario.Edit(serieEditar, serieList, this.table);
        escreverListar();
    }
    
    
    public Serie loadEdit(){
        return SerieUtiltario.loadEdit(serieList, this.table);
    }
        
    public void Pesquisa(String name){
       SerieUtiltario.Pesquisa(name, serieList, this.table);
    }
}
