package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável pela conexao com o banco de dados e execução de instruções
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package util
 * @version 1.0
 *
 */
public class GerenciaConexoesMySql {

    private static GerenciaConexoesMySql gerenciaConexoesMySql = null;
    private static Connection conn = null;
    private static PreparedStatement stmt = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/sisbibliot?zeroDateTimeBehavior=convertToNull";
    private static final String usuario = "root";
    private static final String senha = "mundolinux";

    public static GerenciaConexoesMySql getInstance() {
        if (gerenciaConexoesMySql == null) {
            gerenciaConexoesMySql = new GerenciaConexoesMySql();
        }
        return gerenciaConexoesMySql;
    }

    public GerenciaConexoesMySql() {
    }

    /**
     * Método para conectar com banco de dados
     *
     * @author Aleff
     * @since 26/09/2016
     *
     */
    public void conectarMySql() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, usuario, senha);
                conn.setAutoCommit(true);
                System.out.println("Conectou!!");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(conn + " já esta conectado!!!");
        }
    }

    public void desconectaMySql() {
        if (conn != null) {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conn.close();
                conn = null;
                stmt = null;
                System.out.println("Desconectou!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(conn + " já esta desconectado!!!");
        }
    }

    public PreparedStatement getPreparedStatement(String statement) {
        try {
            if (conn == null) {
                conectarMySql();
            }
            stmt = conn.prepareStatement(statement);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaConexoesMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stmt;
    }

}
