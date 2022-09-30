/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.TextControllers;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Jogo;
import Model.JogoUtilitario;

/**
 *
 * @author adeli
 */
public class TextJogoController extends FileTextController{
    
    ArrayList<Jogo> jogoList;
    public TextJogoController(JTable table) {
        super(table);
        jogoList = new ArrayList<Jogo>();
        if(arquivo.exists()){
            List(this.table);
            ConverterDeString(Ler());
        }
    }

    
    
    @Override
    public String ConverterParaString() {
        String converted = "";
        for(int i= 0; i< jogoList.size(); i++){
            converted = converted + jogoList.get(i).toString();
                        converted = converted + "\n";
        }
        return converted;
    }

    @Override
    public void ConverterDeString(String conteudo) {
        String titulo;
        String genero;
        Integer ranking;
        Integer horasJogadas;
        boolean foiHistoriaTerminada;
        
        StringTokenizer tokenizer = new StringTokenizer(conteudo, "\n");
        
        int size = tokenizer.countTokens();
        for(int i = 1; i <= size; i++){
            String token = tokenizer.nextToken();
            String[] dados = token.split(",");
            titulo = dados[0];
            genero = dados[1];
            ranking = Integer.valueOf(dados[2]);
            horasJogadas = Integer.valueOf(dados[3]);
            if(dados[4].equals("true")){

                foiHistoriaTerminada = true;
            }else{
                foiHistoriaTerminada = false;
            }
            
            Jogo jogo = new Jogo(titulo, genero, ranking, horasJogadas, foiHistoriaTerminada);
            jogoList.add(jogo);
        }
        List(table);
        
    }
    
    @Override
    public void setArquivoNome(){
        this.arquivoNome = "jogo.txt";
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
