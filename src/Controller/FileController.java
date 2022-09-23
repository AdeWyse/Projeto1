/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public abstract class FileController {

    protected File arquivo;
    protected String arquivoPath;
    protected String arquivoNome;
    
    protected JTable table;

    
    public abstract void setArquivoNome();
    
    

    public FileController(JTable table) {

        setArquivoNome();
        getPath();
        arquivo = new File(arquivoPath+ "\\" + this.arquivoNome);
        this.table = table;

    }

    public void getPath() {
        String arquivoPathTemp = System.getProperty(("user.dir"));
        arquivoPath = arquivoPathTemp + "\\src\\Arquivos";
        //Seta o caminho do arquivo para a pasta Arquivos dentro do projeto, 
        //o nome do arquio depois vem do controller especifico de cada classe
    }

    
}
