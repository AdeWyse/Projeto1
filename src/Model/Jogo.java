/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author adeli
 */
public class Jogo extends Midia{
    
    Integer horasJogadas;
    boolean foiHistoriaTerminada;
    
    public Jogo (Integer id, String titulo, String genero, Integer ranking, Integer horasJogadas, boolean foiHistoriaTerminada){
        super(id, titulo,genero,ranking);
        this.setHorasJogadas(horasJogadas);
        this.setFoiHistoriaTerminada(foiHistoriaTerminada);
    }
    
    public void setHorasJogadas(Integer horasJogadas){
        this.horasJogadas = horasJogadas;
    }
    
    public void setFoiHistoriaTerminada(boolean foiTerminada){
        this.foiHistoriaTerminada = foiTerminada;
    }
    
    public  Integer getHorasJogadas(){
        return this.horasJogadas;
    }
    
    public boolean getFoiHistoriaTerminada(){
        return this.foiHistoriaTerminada;
    }
    
    public String toString(){
        String jogo = this.titulo + "," + this.genero + "," + this.ranking.toString() + "," + this.horasJogadas.toString() + "," + this.foiHistoriaTerminada;
        return jogo;
    }
}