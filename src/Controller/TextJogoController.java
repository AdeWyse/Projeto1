/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Jogo;

/**
 *
 * @author adeli
 */
public class JogoController extends FileBinaryController{
    
    ArrayList<Jogo> jogoList;
    public JogoController(JTable table) {
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
    
    // @override
    public void Add(Jogo jogo){
        jogoList.add(jogo);
       EscreverListar();
    }
    
   @Override
    public void Remove(){
        Integer index = this.table.getSelectedRow();
        Jogo jogoRemover = jogoList.get(index);
        jogoList.remove(jogoRemover);
        EscreverListar();
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
        EscreverListar();
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
