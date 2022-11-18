/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class BDController {

    protected JTable table;
    protected Connection connection;
    public BDController(JTable table) {
        try{
                    connection = AcessaDB();

        }catch( IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        this.table = table;
    }
    
    
    public Connection AcessaDB() throws IOException, ClassNotFoundException {
        
        Connection conn = null;
        try {
            
            String url;
            String username;
            String password;
    
            String path = System.getProperty(("user.dir")) + "\\src\\Util";
            File configFile =  new File (path, "config.properties");
            Properties props = new Properties();
            
           
            FileInputStream in = new FileInputStream(configFile);
            props.load(in);
        
            url = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            if (username == null) {
                username = "";
            }
            password = props.getProperty("jdbc.password");
            if (password == null) {
                password = "";
            }
            conn = DriverManager.getConnection(url,username, password);
            conn.setAutoCommit(false);
            System.out.println("Conectou com o banco");
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
