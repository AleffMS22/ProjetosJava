package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ModelLivro;
import util.GerenciaConexoesMySql;

/**
 * Classe responsável pela manipulação de dados na tb_livro
 *
 * @access public
 * @author Aleff
 * @since 27/09/2016
 * @package dao
 * @version 1.0
 *
 */
public class DaoLivro {

    PreparedStatement stmt;
    GerenciaConexoesMySql conn = new GerenciaConexoesMySql();

    public boolean insertLivro(ModelLivro livro) {
        String sql = "INSERT INTO tb_livro (titulo_livro,autor_livro,qtde_livros)VALUES(?,?,?)";

        boolean retorno = false;
        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, livro.getTituloLivro());
            stmt.setString(2, livro.getAutorLivro());
            stmt.setInt(3, livro.getQtdeLivros());

            stmt.executeUpdate();
            retorno = true;

        } catch (SQLException e) {
            e.printStackTrace();
            retorno = false;
        } catch (Exception e) {
            e.printStackTrace();
            retorno = false;
        } finally {
            conn.desconectaMySql();
        }

        return retorno;
    }
}
