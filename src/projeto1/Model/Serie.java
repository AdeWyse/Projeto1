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
    int numEpisodios;
    int numEpisodiosAssistidos;
    
    public Serie(String titulo, String genero, int ranking, int numEpisodios, int numEpisodiosAssistidos){
        super(titulo,genero,ranking);
        this.setNumEpisodios(numEpisodios);
        this.setNumEpisodiosAssistidos(numEpisodiosAssistidos);
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public int getNumEpisodiosAssistidos() {
        return numEpisodiosAssistidos;
    }

    public void setNumEpisodiosAssistidos(int numEpisodiosAssistidos) {
        this.numEpisodiosAssistidos = numEpisodiosAssistidos;
    }
    
}
