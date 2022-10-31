/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class BDController {

    protected JTable table;
    protected Connection connection;
    public BDController(JTable table) {
        connection = AcessaDB();
        this.table = table;
    }
    
    
    public Connection AcessaDB(){
        
        Connection conn = null;
        try {
            String path = System.getProperty(("user.dir")) + "\\src\\Util";
            File configFile =  new File (path, "config.properties");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "admin");
            conn.setAutoCommit(false);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return null;
        }

       return conn;
    }
    
    public boolean FechaDB(){
        if (connection != null) {
            try {
                connection.close();
                return true;
            } catch (SQLException erro) {
                System.err.println("Erro ao fechar a conexão = " + erro);
                return false;
            }
        } else {
            return false;
        }
    }
}
