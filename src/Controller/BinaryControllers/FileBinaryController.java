/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.BinaryControllers;

import Controller.FileController;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author adeli
 */
public class FileBinaryController extends FileController {

    private Object objeto = null;
    private ObjectInputStream reader = null;
    private ObjectOutputStream writer = null;

    public ArrayList<Object> objectsList = null;

    public void List(JTable table) {
        //Aqui para poder chamar List() no controller especifico
    }

    public void ConverterParaObject() {
        //Aqui para poder chamar escrever() no controller especifico
    }

    public void setArquivoNome() {
    }

    public FileBinaryController(JTable table) {
        super(table);
        objectsList = new ArrayList<Object>();
    }

    public Object getObjeto() {
        return this.objeto;
    }

    public void setObject(Object objeto) {
        this.objeto = objeto;
    }

    public boolean ler() {
        if (arquivo.exists()) {

            try {
                if (arquivo != null) {
                    reader = new ObjectInputStream(new FileInputStream(arquivo));
                    while (true) {
                        try {
                            objeto = reader.readObject();

                            objectsList.add(objeto);
                        } catch (EOFException erro) {
                            break;
                        }
                    }
                    reader.close();
                    return true;
                } else {
                    return false;

                }

            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao ler arquivo binario.");
                return false;
            } catch (ClassNotFoundException erro) {
                System.err.println(erro.getMessage() + "Classe nao encontrada.");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean escrever()
            throws IOException {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo != null) {
            try {
                writer = new ObjectOutputStream(new FileOutputStream(arquivo, false));
                for (int i = 0; i < this.objectsList.size(); i++) {
                    objeto = this.objectsList.get(i);
                    writer.writeObject(objeto);

                }

                writer.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao escrever arquivo binario.");
                return false;
            }
        } else {
            return false;
        }
    }

    public void escreverListar() {
        try {
            ConverterParaObject();
            escrever();
        } catch (IOException e) {
            System.out.println("Erro Escrever\n");
        }
        List(this.table);
    }

}
