package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    String banco,servidor,senha,usuario;

    public Connection conexao;
    public Conexao(){
    this.servidor = "localhost";
    this.banco = "db_empresa";
    this.usuario = "root";
    this.senha = "bcd1278";
    }

    public boolean connectDrive(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.servidor + "/" + this.banco, this.usuario, this.senha);

            return true;
        } catch (SQLException erro) {
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection(){
        connectDrive();
        return conexao;
    }

}
