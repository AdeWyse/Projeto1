/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

import Model.Jogo;
import Model.JogoUtilitario;
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
    
    public void Add(Jogo jogo){
        jogoList = JogoUtilitario.Add(jogo, jogoList);
       escreverListar();
    }
    
    public void Remove(){
        jogoList = JogoUtilitario.Remove(jogoList, this.table);
        escreverListar();
    }
    
    @Override    
    public void List(JTable table){
        
       JogoUtilitario.List(jogoList, this.table);
    }
    
    public void Edit(Jogo jogoEditar){
        jogoList = JogoUtilitario.Edit(jogoEditar, jogoList, this.table);
        escreverListar();
    }
    
    
    public Jogo loadEdit(){
        return JogoUtilitario.loadEdit(jogoList, this.table);
    }
    
    public void Pesquisa(String name){
       JogoUtilitario.Pesquisa(name, jogoList, this.table);
    }
        
}
