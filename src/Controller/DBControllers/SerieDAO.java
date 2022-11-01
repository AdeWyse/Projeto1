/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.DBControllers;

import Controller.BDController;
import Model.Serie;
import Model.SerieUtilitario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class SerieDAO extends BDController{
    
    private static final String sqlconsultaSerie = "SELECT * FROM serie order by titulo";
    private static final String sqlinserir = "INSERT INTO serie (titulo, genero, ranking, numepisodios, numepisodiosassistidos) VALUES ( ?, ?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE serie SET titulo = ?, genero = ?, ranking = ?, numepisodios = ?, numepisodiosassistidos = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM serie WHERE id = ?";
    private PreparedStatement pstdados = null;
    private ResultSet rsdados = null;
    ArrayList<Serie> series;
    public SerieDAO(JTable table) {
        super(table);
        series = new ArrayList<Serie>();
        List(this.table);
    }
    public boolean Insert(Serie serie) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setString(1, serie.getTitulo());
            pstdados.setString(2, serie.getGenero());
            pstdados.setInt(3, serie.getRanking());
            pstdados.setInt(4, serie.getNumEpisodios());
            pstdados.setInt(5, serie.getNumEpisodiosAssistidos());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            
            if (resposta == 1) {
                connection.commit();
                List(table);
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da inserção = " + erro);
        }
        return false;
    }
     
    public void List(JTable table){
      ConsultarTodos();
      SerieUtilitario.List(series, this.table);
    }
    
    public Serie loadEdit(){
        return SerieUtilitario.loadEdit(series, this.table);
    }

    public boolean Edit(Serie serie) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, serie.getTitulo());
            pstdados.setString(2, serie.getGenero());
            pstdados.setInt(3, serie.getRanking());
            pstdados.setInt(4, serie.getNumEpisodios());
            pstdados.setInt(5, serie.getNumEpisodiosAssistidos());
            pstdados.setInt(6, serie.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            if (resposta == 1) {
                connection.commit();
                List(table);
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da atualização = " + erro);
        }
        return false;
    }

    
     public void Remove(){
       Integer index = table.getSelectedRow();
        Excluir(series.get(index));
    }
     
    public boolean Excluir(Serie serie) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, serie.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            if (resposta == 1) {
                connection.commit();
                List(table);
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da exclusão = " + erro);
        }
        return false;
    }
    public boolean ConsultarTodos() {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlconsultaSerie, tipo, concorrencia);
            rsdados = pstdados.executeQuery();
            series.clear();
            while(rsdados.next()){
                Serie serie = new Serie(
                rsdados.getInt("id"),
                rsdados.getString("titulo"),
                rsdados.getString("genero"),
                rsdados.getInt("ranking"),
                rsdados.getInt("numEpisodios"),
                rsdados.getInt("numEpisodiosAssistidos"));
                series.add(serie);
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }
    
    public void Pesquisa(String name){
        SerieUtilitario.Pesquisa(name, series, this.table);
    }

}
