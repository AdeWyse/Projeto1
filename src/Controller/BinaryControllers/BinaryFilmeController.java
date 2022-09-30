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
import Model.Filme;
import Model.FilmeUtilitario;
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
        filmeList = FilmeUtilitario.Add(filme, filmeList);
       escreverListar();
    }
    
    public void Remove(){
       filmeList = FilmeUtilitario.Remove(filmeList, this.table);
        escreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
      FilmeUtilitario.List(this.table, filmeList);
    }
    
   // @Override
    public void Edit(Filme filmeEditar){
        filmeList = FilmeUtilitario.Edit(filmeEditar, filmeList, this.table);
        escreverListar();
    }
    
    
    public Filme loadEdit(){
        return FilmeUtilitario.loadEdit(filmeList, this.table);
    }
    
    public void Pesquisa(String name){
        FilmeUtilitario.Pesquisa(name, filmeList, this.table);
    }
    
   }
