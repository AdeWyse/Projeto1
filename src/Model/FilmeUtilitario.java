/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class FilmeUtilitario {
    
     public static ArrayList<Filme> Add(Filme filme, ArrayList<Filme> filmeList){
        filmeList.add(filme);
        return filmeList;
    }
     
      public static ArrayList<Filme> Remove(ArrayList<Filme> filmeList, JTable table){
        Integer index = table.getSelectedRow();
        Filme filmeRemover = filmeList.get(index);
        filmeList.remove(filmeRemover);
        return filmeList;
    }
      
     public static void List(JTable table, ArrayList<Filme> filmeList){
        
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
     
      public static ArrayList<Filme> Edit(Filme filmeEditar, ArrayList<Filme> filmeList, JTable table){
        Integer index = table.getSelectedRow();
        filmeList.get(index).setTitulo(filmeEditar.getTitulo());
        filmeList.get(index).setGenero(filmeEditar.getGenero());
        filmeList.get(index).setRanking(filmeEditar.getRanking());
        filmeList.get(index).setFoiAssistido(filmeEditar.getFoiAssistido());
        return filmeList;
    }
      
     public static Filme loadEdit(ArrayList<Filme> filmeList, JTable table){
        Integer index = table.getSelectedRow();
        return filmeList.get(index);
    }
     
     public static void Pesquisa(String name, ArrayList<Filme> filmeList, JTable table){
         boolean isFound = false;
        for(int i = 0; i <filmeList.size(); i++){
           if(filmeList.get(i).getTitulo().contains(name)){
               table.setRowSelectionInterval(i, i);
               isFound = true;
               return;
           }
       }
        
        if(!isFound){
            JOptionPane.showMessageDialog(table, "Filme não encontrado.");
        }
    }
}
