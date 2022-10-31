/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.TextControllers;

import java.util.ArrayList;
import java.util.StringTokenizer;
import Model.Filme;
import Model.FilmeUtilitario;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class TextFilmeController extends FileTextController{

    ArrayList<Filme> filmeList;
    public TextFilmeController(JTable table) {
        super(table);
        filmeList = new ArrayList<Filme>();
        if(arquivo.exists()){
            List(this.table);
            ConverterDeString(Ler());
        }
    }

    
    
    @Override
    public String ConverterParaString() {
        String converted = "";
        for(int i= 0; i< filmeList.size(); i++){
            converted = converted + filmeList.get(i).toString();
                        converted = converted + "\n";
        }
        return converted;
    }

    @Override
    public void ConverterDeString(String conteudo) {
        String titulo;
        String genero;
        Integer ranking;
        boolean foiAssistido;
        
        StringTokenizer tokenizer = new StringTokenizer(conteudo, "\n");
        
        int size = tokenizer.countTokens();
        for(int i = 1; i <= size; i++){
            String token = tokenizer.nextToken();
            String[] dados = token.split(",");
            titulo = dados[0];
            genero = dados[1];
            ranking = Integer.valueOf(dados[2]);
            if(dados[3].equals("true")){

                foiAssistido = true;
            }else{
                foiAssistido = false;
            }
            
            Filme filme = new Filme(0,titulo, genero, ranking, foiAssistido);
            filmeList.add(filme);
        }
        List(table);
        
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "filme.txt";
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
