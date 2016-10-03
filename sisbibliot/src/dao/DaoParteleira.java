package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelParteleira;
import util.GerenciaConexoesMySql;

/**
 * Classe responsável pela manipulação de dados na tb_parteleira
 *
 * @access public
 * @author Aleff
 * @since 27/09/2016
 * @package dao
 * @version 1.0
 *
 */
public class DaoParteleira {

    PreparedStatement stmt;
    GerenciaConexoesMySql conn = new GerenciaConexoesMySql();

    public boolean insertPartileira(ModelParteleira parteleira) {
        String sql = "INSERT INTO tb_parteleira (secao_livro)VALUES(?)";

        boolean retorno = false;
        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, parteleira.getSecaoLivro());

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

    public boolean updateParteleira(ModelParteleira parteleira) {
        String sql = "UPDATE tb_parteleira SET secao_livro = ? WHERE id_parteleira = ?";
        boolean retorno = false;

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setString(1, parteleira.getSecaoLivro());
            stmt.setInt(2, parteleira.getIdParteleira());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            retorno = false;
        } finally {
            conn.desconectaMySql();
        }

        return retorno;
    }

    public List<ModelParteleira> selectParteleira() {
        String sql = "select * from tb_parteleira";

        List<ModelParteleira> listaParteleiras = new ArrayList<ModelParteleira>();

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ModelParteleira parteleira = new ModelParteleira();

                parteleira.setIdParteleira(rs.getInt("id_parteleira"));
                parteleira.setSecaoLivro(rs.getString("secao_livro"));
                listaParteleiras.add(parteleira);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.desconectaMySql();
        }
        return listaParteleiras;
    }

    public void deleteParteleira(ModelParteleira parteleira) {
        String sql = "DELETE FROM tb_parteleira WHERE id_parteleira = ?";

        try {
            conn.conectarMySql();
            stmt = conn.getPreparedStatement(sql);

            stmt.setInt(1, parteleira.getIdParteleira());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.desconectaMySql();
        }
    }
}
