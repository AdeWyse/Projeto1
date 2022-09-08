/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1.Model;

/**
 *
 * @author adeli
 */
public class Midia {
    String titulo;
    String genero;
    int ranking;
    
    public Midia(String titulo, String genero, int ranking){
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setRanking(ranking);
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public void setGenero(String genero){
        this.genero = genero;
    }
     
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
    
     public String getTitulo(String titulo){
        return this.titulo;
    }
    
     public String getGenero(String genero){
        return this.genero;
    }
     
    public int getRanking(int ranking){
        return this.ranking;
    }
}
