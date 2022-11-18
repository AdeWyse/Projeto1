/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author adeli
 */
public abstract class Midia implements java.io.Serializable{
    private static long serialVersionUID = 2;

    Integer id;
    String titulo;
    String genero;
    Integer ranking;
    public abstract String toString();
    
    public Midia(Integer id, String titulo, String genero, Integer ranking){
        this.id = id;
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setRanking(ranking);
    }
    
     public void setId(Integer id){
        this.id = id;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public void setGenero(String genero){
        this.genero = genero;
    }
     
    public void setRanking(Integer ranking){
        this.ranking = ranking;
    }
    
     public Integer getId(){
         
       return this.id ;
    }
    
     public String getTitulo(){
        return this.titulo;
    }
    
     public String getGenero(){
        return this.genero;
    }
     
    public Integer getRanking(){
        return this.ranking;
    }
    
}
