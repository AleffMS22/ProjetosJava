package dao;

//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelEditora;
import util.GerenciaConexoesMySql;

/**
 * Classe responsável pela manipulação de dados na tb_editora
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package dao
 * @version 1.0
 *
 */
public class DaoEditora {

    PreparedStatement stmt;
    GerenciaConexoesMySql conn = new GerenciaConexoesMySql();

    public boolean insertEditora(ModelEditora editora) {
        String sql = "INSERT INTO tb_editora (nome_editora,ano_publicacao)VALUES(?,?)";

        boolean retorno = false;
        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, editora.getNomeEditora());
            stmt.setString(2, editora.getAnoPublicacao());

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

    public boolean updateEditora(ModelEditora editora) {
        String sql = "UPDATE tb_editora SET nome_editora = ?,ano_publicacao = ? WHERE id_editora = ?";
        boolean retorno = false;

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, editora.getNomeEditora());
            stmt.setString(2, editora.getAnoPublicacao());
            stmt.setInt(3, editora.getIdEditora());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            retorno = false;
        } finally {
            conn.desconectaMySql();
        }

        return retorno;
    }

    public List<ModelEditora> selectEditora() {
        String sql = "select * from tb_editora";

        List<ModelEditora> listaEditora = new ArrayList<ModelEditora>();

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ModelEditora editora = new ModelEditora();

                editora.setIdEditora(rs.getInt("id_editora"));
                editora.setNomeEditora(rs.getString("nome_editora"));
                editora.setAnoPublicacao(rs.getString("ano_publicacao"));
                listaEditora.add(editora);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.desconectaMySql();
        }
        return listaEditora;
    }

    public void deleteEditora(ModelEditora editora) {
        String sql = "DELETE FROM tb_editora WHERE id_editora = ?";

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setInt(1, editora.getIdEditora());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.desconectaMySql();
        }
    }
}
