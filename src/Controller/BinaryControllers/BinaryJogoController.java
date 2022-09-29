/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

import Model.Jogo;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class BinaryJogoController extends FileBinaryController{
    
    ArrayList<Jogo> jogoList;
    public BinaryJogoController(JTable table) {
        super(table);
        jogoList = new ArrayList<Jogo>();
        ler();
        ConverterParaJogo();
        if(arquivo.exists()){
            List(this.table);
        }
    }
    
    public void ConverterParaJogo() {
        jogoList = new ArrayList<Jogo>();
        
       for(int i= 0; i< objectsList.size(); i++){
           Jogo temp = (Jogo) this.objectsList.get(i);
           jogoList.add(temp);
       }
    }
    @Override
    public void ConverterParaObject() {
        this.objectsList.clear();
       for(int i= 0; i< jogoList.size(); i++){
           Object temp = (Object) this.jogoList.get(i);
           this.objectsList.add(temp);
       }
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "jogo.bin";
    }
    
    // @override
    public void Add(Jogo jogo){
        jogoList.add(jogo);
       escreverListar();
    }
    
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Jogo jogoRemover = jogoList.get(index);
        jogoList.remove(jogoRemover);
        escreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
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
    
   // @Override
    public void Edit(Jogo jogoEditar){
        Integer index = this.table.getSelectedRow();
        jogoList.get(index).setTitulo(jogoEditar.getTitulo());
        jogoList.get(index).setGenero(jogoEditar.getGenero());
        jogoList.get(index).setRanking(jogoEditar.getRanking());
        jogoList.get(index).setHorasJogadas(jogoEditar.getHorasJogadas());
        jogoList.get(index).setFoiHistoriaTerminada(jogoEditar.getFoiHistoriaTerminada());
        escreverListar();
    }
    
    
    public Jogo loadEdit(){
        Integer index = this.table.getSelectedRow();
        return jogoList.get(index);
    }
    
    public void Pesquisa(String name){
        for(int i = 0; i <jogoList.size(); i++){
           if(jogoList.get(i).getTitulo().contains(name)){
               this.table.setRowSelectionInterval(i, i);
               return;
           }
       }
    }
        
}
