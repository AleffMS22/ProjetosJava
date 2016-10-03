package test;

import dao.DaoParteleira;
import dao.DaoTipo;
import java.util.ArrayList;
import java.util.List;
import model.ModelParteleira;
import model.ModelTipo;

/**
 *
 * @author aleff
 */
public class TestSelect {

    public static void main(String[] args) {

        // ModelEditora editora = new ModelEditora();
        // ModelTipo modelTipo = new ModelTipo();
        ModelParteleira modelParteleira = new ModelParteleira();
        // DaoEditora sedit = new DaoEditora();
        // DaoTipo daoTipo = new DaoTipo();
        DaoParteleira daoParteleira = new DaoParteleira();
        List<ModelParteleira> listaParteleiras = new ArrayList<ModelParteleira>();
        listaParteleiras = daoParteleira.selectParteleira();

        for (int i = 0; i < listaParteleiras.size(); i++) {
            System.out.println(listaParteleiras.get(i).getIdParteleira()+ " " + listaParteleiras.get(i).getSecaoLivro());

        }

    }

}
