package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelEditora;
import model.ModelTipo;
import util.GerenciaConexoesMySql;

/**
 * Classe responsável pela manipulação de dados na tb_tipo
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016 e 27/09/2016
 * @package dao
 * @version 1.0
 *
 */
public class DaoTipo {

    PreparedStatement stmt;
    GerenciaConexoesMySql conn = new GerenciaConexoesMySql();

    public boolean insertTipo(ModelTipo tipo) {
        String sql = "INSERT INTO tb_tipo (tipo_livro,tipo_descricao)VALUES(?,?)";

        boolean retorno = false;
        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, tipo.getTipoLivro());
            stmt.setString(2, tipo.getTipoDescricao());

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

    public boolean updateTipo(ModelTipo tipo) {
        String sql = "UPDATE tb_tipo SET tipo_livro = ?,tipo_descricao = ? WHERE id_tipo = ?";
        boolean retorno = false;

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, tipo.getTipoLivro());
            stmt.setString(2, tipo.getTipoDescricao());
            stmt.setInt(3, tipo.getIdTipo());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            retorno = false;
        } finally {
            conn.desconectaMySql();
        }

        return retorno;
    }

    public List<ModelTipo> selectTipo() {
        String sql = "select * from tb_tipo";

        List<ModelTipo> listaTipo = new ArrayList<ModelTipo>();

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ModelTipo tipo = new ModelTipo();

                tipo.setIdTipo(rs.getInt("id_tipo"));
                tipo.setTipoLivro(rs.getString("tipo_livro"));
                tipo.setTipoDescricao(rs.getString("tipo_descricao"));
                listaTipo.add(tipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.desconectaMySql();
        }
        return listaTipo;
    }

    public void deleteTipo(ModelTipo tipo) {
        String sql = "DELETE FROM tb_tipo WHERE id_tipo = ?";

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setInt(1, tipo.getIdTipo());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.desconectaMySql();
        }
    }
}
