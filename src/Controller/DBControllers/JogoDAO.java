/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.DBControllers;

import Controller.BDController;
import Model.Jogo;
import Model.JogoUtilitario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author UTFPR
 */
public class JogoDAO extends BDController {
    private static final String sqlconsultaJogo = "SELECT * FROM jogo order by titulo";
    private static final String sqlinserir = "INSERT INTO jogo (titulo, genero, ranking, horasjogadas, foihistoriaterminada) VALUES ( ?, ?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE jogo SET titulo = ?, genero = ?, ranking = ?, horasjogadas = ?, foihistoriaterminada = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM jogo WHERE id = ?";
    private PreparedStatement pstdados = null;
    private ResultSet rsdados = null;
    ArrayList<Jogo> jogos;
    public JogoDAO(JTable table) {

        super(table);
        jogos = new ArrayList<Jogo>();
        List(this.table);
    }
    public boolean Insert(Jogo jogo) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setString(1, jogo.getTitulo());
            pstdados.setString(2, jogo.getGenero());
            pstdados.setInt(3, jogo.getRanking());
            pstdados.setInt(4, jogo.getHorasJogadas());
            pstdados.setBoolean(5, jogo.getFoiHistoriaTerminada());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println(resposta);
            
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
      JogoUtilitario.List(jogos, this.table);
    }
    
    public Jogo loadEdit(){
        return JogoUtilitario.loadEdit(jogos, this.table);
    }

    public boolean Edit(Jogo jogo) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, jogo.getTitulo());
            pstdados.setString(2, jogo.getGenero());
            pstdados.setInt(3, jogo.getRanking());
            pstdados.setInt(4, jogo.getHorasJogadas());
            pstdados.setBoolean(5, jogo.getFoiHistoriaTerminada());
            pstdados.setInt(6, jogo.getId());
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
        Excluir(jogos.get(index));
    }
     
    public boolean Excluir(Jogo jogo) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, jogo.getId());
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
            pstdados = connection.prepareStatement(sqlconsultaJogo, tipo, concorrencia);
            rsdados = pstdados.executeQuery();
            jogos.clear();
            while(rsdados.next()){
                Jogo jogo = new Jogo(
                rsdados.getInt("id"),
                rsdados.getString("titulo"),
                rsdados.getString("genero"),
                rsdados.getInt("ranking"),
                rsdados.getInt("horasJogadas"),
                rsdados.getBoolean("foiHistoriaTerminada"));
                jogos.add(jogo);
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }
    
    public void Pesquisa(String name){
        JogoUtilitario.Pesquisa(name, jogos, this.table);
    }
}
