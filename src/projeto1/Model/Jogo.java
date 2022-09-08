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
    
    public Jogo (String titulo, String genero, int ranking, float horasJogadas){
        super(titulo,genero,ranking);
        this.setHorasJogadas(horasJogadas);
    }
    
    
    
    public void setHorasJogadas(float horasJogadas){
        this.horasJogadas = horasJogadas;
    }
    
   
    
    public  float getFoiAssistido(boolean foiAssistido){
        return this.horasJogadas;
    }
}