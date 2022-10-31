/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.DBControllers;

import Controller.BDController;
import Model.Filme;
import Model.FilmeUtilitario;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class FilmeDAO extends BDController {

    private static final String sqlconsultaFilme = "SELECT * FROM filme order by titulo";
    private static final String sqlinserir = "INSERT INTO filme (titulo, genero, ranking, foiAssistido) VALUES ( ?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE filme SET titulo = ?, genero = ?, ranking = ?, foiAssistido = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM filme WHERE id = ?";
    private PreparedStatement pstdados = null;
    private ResultSet rsdados = null;
    ArrayList<Filme> filmes;
    public FilmeDAO(JTable table) {
        super(table);
        filmes = new ArrayList<Filme>();
        List(this.table);
    }
    public boolean Insert(Filme filme) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setString(1, filme.getTitulo());
            pstdados.setString(2, filme.getGenero());
            pstdados.setInt(3, filme.getRanking());
            pstdados.setBoolean(4, filme.getFoiAssistido());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            //DEBUG
            System.out.println("Resposta da inserção = " + resposta);
            //FIM-DEBUG
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
      FilmeUtilitario.List(this.table, filmes);
    }
    
    public Filme loadEdit(){
        return FilmeUtilitario.loadEdit(filmes, this.table);
    }

    public boolean Edit(Filme filme) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, filme.getTitulo());
            pstdados.setString(2, filme.getGenero());
            pstdados.setInt(3, filme.getRanking());
            pstdados.setBoolean(4, filme.getFoiAssistido());
            pstdados.setInt(5, filme.getId());
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
        Excluir(filmes.get(index));
    }
     
    public boolean Excluir(Filme filme) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, filme.getId());
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
            pstdados = connection.prepareStatement(sqlconsultaFilme, tipo, concorrencia);
            rsdados = pstdados.executeQuery();
            filmes.clear();
            while(rsdados.next()){
                Filme filme = new Filme(
                rsdados.getInt("id"),
                rsdados.getString("titulo"),
                rsdados.getString("genero"),
                rsdados.getInt("ranking"),
                rsdados.getBoolean("foiAssistido"));
                filmes.add(filme);
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }

    
}
