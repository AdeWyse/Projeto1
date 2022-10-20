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
public class JogoUtilitario {
    
    public static ArrayList<Jogo> Add(Jogo jogo, ArrayList<Jogo> jogoList){
        jogoList.add(jogo);
       return jogoList;
    }
    
    public static ArrayList<Jogo> Remove(ArrayList<Jogo> jogoList, JTable table){
        Integer index = table.getSelectedRow();
        Jogo jogoRemover = jogoList.get(index);
        jogoList.remove(jogoRemover);
        return jogoList;
    }
    
    public static void List(ArrayList<Jogo> jogoList, JTable table){
        
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       for(int i = 0; i < jogoList.size(); i++){
           String titulo = jogoList.get(i).getTitulo();
           String genero = jogoList.get(i).getGenero();
           Integer ranking = jogoList.get(i).getRanking();
           Integer horasJogadas = jogoList.get(i).getHorasJogadas();
           boolean foiHistoriaTerminada = jogoList.get(i).getFoiHistoriaTerminada();
           
           Object[] data = {titulo, genero, ranking, horasJogadas, foiHistoriaTerminada};
           
         model.addRow(data);
       }
    }
    
    public static ArrayList<Jogo> Edit(Jogo jogoEditar, ArrayList<Jogo> jogoList, JTable table){
        Integer index = table.getSelectedRow();
        jogoList.get(index).setTitulo(jogoEditar.getTitulo());
        jogoList.get(index).setGenero(jogoEditar.getGenero());
        jogoList.get(index).setRanking(jogoEditar.getRanking());
        jogoList.get(index).setHorasJogadas(jogoEditar.getHorasJogadas());
        jogoList.get(index).setFoiHistoriaTerminada(jogoEditar.getFoiHistoriaTerminada());
        return jogoList;
    }
    
    
    public static Jogo loadEdit(ArrayList<Jogo> jogoList, JTable table){
        Integer index = table.getSelectedRow();
        return jogoList.get(index);
    }
    
    public static void Pesquisa(String name, ArrayList<Jogo> jogoList, JTable table){
        
         boolean isFound = false;
         
        for(int i = 0; i <jogoList.size(); i++){
           if(jogoList.get(i).getTitulo().contains(name)){
               table.setRowSelectionInterval(i, i);
               isFound = true;
               return;
           }
       }
        
        if(!isFound){
            JOptionPane.showMessageDialog(table, "Jogo não encontrado.");
        }
    }
}
