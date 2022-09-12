/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1.Model;

/**
 *
 * @author UTFPR
 */
public class Serie extends Midia{
    Integer numEpisodios;
    Integer numEpisodiosAssistidos;
    
    public Serie(String titulo, String genero, int ranking, Integer numEpisodios, Integer numEpisodiosAssistidos){
        super(titulo,genero,ranking);
        this.setNumEpisodios(numEpisodios);
        this.setNumEpisodiosAssistidos(numEpisodiosAssistidos);
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(Integer numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public int getNumEpisodiosAssistidos() {
        return numEpisodiosAssistidos;
    }

    public void setNumEpisodiosAssistidos(Integer numEpisodiosAssistidos) {
        this.numEpisodiosAssistidos = numEpisodiosAssistidos;
    }
    
    public String toString(){
        String serie = this.titulo + "," + this.genero + "," + this.ranking.toString() + "," + this.numEpisodios + "," + this.numEpisodiosAssistidos;
        return serie;
    }
    
}
