/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

import Model.Serie;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class BinarySerieController extends FileBinaryController{

    ArrayList<Serie> serieList = null;
    
    public BinarySerieController(JTable table) {
        super(table);
        serieList = new ArrayList<Serie>();
        ler();
        ConverterParaSerie();
        if(arquivo.exists()){
            List(this.table);
        }
    }

    public void ConverterParaSerie() {
        serieList = new ArrayList<Serie>();
        
       for(int i= 0; i< objectsList.size(); i++){
           Serie temp = (Serie) this.objectsList.get(i);
           serieList.add(temp);
       }
    }
    @Override
    public void ConverterParaObject() {
        this.objectsList.clear();
       for(int i= 0; i< serieList.size(); i++){
           Object temp = (Object) this.serieList.get(i);
           this.objectsList.add(temp);
       }
    }

    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "serie.bin";
    }
    
    // @override
    public void Add(Serie serie){
        serieList.add(serie);
       escreverListar();
    }
    
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Serie serieRemover = serieList.get(index);
        serieList.remove(serieRemover);
        escreverListar();
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
        escreverListar();
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
