/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class SerieUtiltario {
    
     
    
    public static ArrayList<Serie> Add(Serie serie, ArrayList<Serie> serieList){
        serieList.add(serie);
        return serieList;
    }
    
    public static ArrayList<Serie> Remove(ArrayList<Serie> serieList, JTable table){
        Integer index = table.getSelectedRow();
        Serie serieRemover = serieList.get(index);
        serieList.remove(serieRemover);
        return serieList;
    }  
    public static void List(ArrayList<Serie> serieList, JTable table){
        
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
    
   
    public static ArrayList<Serie> Edit(Serie serieEditar, ArrayList<Serie> serieList, JTable table){
        Integer index = table.getSelectedRow();
        serieList.get(index).setTitulo(serieEditar.getTitulo());
        serieList.get(index).setGenero(serieEditar.getGenero());
        serieList.get(index).setRanking(serieEditar.getRanking());
        serieList.get(index).setNumEpisodios(serieEditar.getNumEpisodios());
        serieList.get(index).setNumEpisodiosAssistidos(serieEditar.getNumEpisodiosAssistidos());
        return serieList;
    }
    
    
    public static Serie loadEdit(ArrayList<Serie> serieList, JTable table){
        Integer index = table.getSelectedRow();
        return serieList.get(index);
    }
        
    public static void Pesquisa(String name, ArrayList<Serie> serieList, JTable table){
        for(int i = 0; i <serieList.size(); i++){
           if(serieList.get(i).getTitulo().contains(name)){
               table.setRowSelectionInterval(i, i);
               return;
           }
       }
    }
}
