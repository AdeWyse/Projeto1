/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author adeli
 */
public class Filme extends Midia{
    boolean foiAssistido;
    
    public Filme(Integer id, String titulo, String genero, Integer ranking, boolean foiAssistido){
        super(id,titulo,genero,ranking);
        this.setFoiAssistido(foiAssistido);
    }
    
    public void setFoiAssistido(boolean foiAssistido){
        this.foiAssistido = foiAssistido;
    }
    
    public  boolean getFoiAssistido(){
        return this.foiAssistido;
    }
    
    public String toString(){
        String filme = this.titulo + "," + this.genero + "," + this.ranking.toString() + "," + this.foiAssistido;
        return filme;
    }
}
