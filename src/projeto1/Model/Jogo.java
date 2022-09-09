/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1.Model;

/**
 *
 * @author adeli
 */
public class Jogo extends Midia{
    
    float horasJogadas;
    boolean foiHistoriaTerminada;
    boolean foiZerado;
    
    public Jogo (String titulo, String genero, int ranking, float horasJogadas, boolean foiHistoriaTerminada, boolean foiZerado){
        super(titulo,genero,ranking);
        this.setHorasJogadas(horasJogadas);
        this.setFoiHistoriaTerminada(foiHistoriaTerminada);
        this.setFoiZerado(foiZerado);
    }
    
    public void setHorasJogadas(float horasJogadas){
        this.horasJogadas = horasJogadas;
    }
    
    public void setFoiHistoriaTerminada(boolean foiTerminada){
        this.foiHistoriaTerminada = foiTerminada;
    }
    
    public void setFoiZerado(boolean foiZeradd){
        this.foiZerado = foiZerado;
    }
    
    public  float getHorasJogadas(){
        return this.horasJogadas;
    }
    
    public boolean getFoiHistoriaTerminada(){
        return this.foiHistoriaTerminada;
    }
    
     public boolean getFoiZerado(){
        return this.foiZerado;
    }
}