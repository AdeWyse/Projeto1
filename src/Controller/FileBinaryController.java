/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JTable;

/**
 *
 * @author adeli
     
    public String Ler(){
        return "a";
    }
    
    public void Escrever(String conteudo){
    }
    
    public void EscreverListar(){
    }
}
*/
public abstract class FileBinaryController extends FileController {

    public abstract void Pesquisa(String nome);
    public abstract void List(JTable table);
    public abstract void Remove();
    public abstract String ConverterParaString();
    public abstract void ConverterDeString(String conteudo);
    @Override
    public void setArquivoNome() {
    }

    public FileBinaryController(JTable table) {
        super(table);
    }
}