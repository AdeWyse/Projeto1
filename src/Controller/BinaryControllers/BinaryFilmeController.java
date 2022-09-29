/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

/**
 *
 * @author adeli
 */
import java.util.ArrayList;
import java.util.StringTokenizer;
import Model.Filme;
import Model.Midia;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */
public class BinaryFilmeController extends FileBinaryController{

    public ArrayList<Filme> filmeList = null;
    
    public BinaryFilmeController(JTable table) {
        super(table);
        ler();
        ConverterParaFilme();
        if(arquivo.exists()){
            List(this.table);
            
        }
    }
    
    public void ConverterParaFilme() {
        filmeList = new ArrayList<Filme>();
        
       for(int i= 0; i< objectsList.size(); i++){
           Filme temp = (Filme) this.objectsList.get(i);
           filmeList.add(temp);
       }
    }
    @Override
    public void ConverterParaObject() {
        this.objectsList.clear();
       for(int i= 0; i< filmeList.size(); i++){
           Object temp = (Object) this.filmeList.get(i);
           this.objectsList.add(temp);
       }
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "filme.bin";
    }
    
    // @override
    public void Add(Filme filme){
        filmeList.add(filme);
       escreverListar();
    }
    
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Filme filmeRemover = filmeList.get(index);
        filmeList.remove(filmeRemover);
        escreverListar();
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
        escreverListar();
    }
    
    
    public Filme loadEdit(){
        Integer index = this.table.getSelectedRow();
        return filmeList.get(index);
    }
    
    public void Pesquisa(String name){
        for(int i = 0; i <filmeList.size(); i++){
           if(filmeList.get(i).getTitulo().contains(name)){
               this.table.setRowSelectionInterval(i, i);
               return;
           }
       }
    }
    
   }
