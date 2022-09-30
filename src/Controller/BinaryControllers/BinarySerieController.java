/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

import Model.Serie;
import Model.SerieUtiltario;
import java.util.ArrayList;
import javax.swing.JTable;

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
