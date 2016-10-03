package test;

// import dao.DaoEditora;
import dao.DaoParteleira;
import model.ModelParteleira;
// import model.ModelEditora;

/**
 *
 * @author aleff
 */
public class TestUpdate {

    public static void main(String[] args) {
        // ModelEditora editora = new ModelEditora();
        // DaoEditora insert = new DaoEditora();

        // ModelTipo modelTipo = new ModelTipo();
        ModelParteleira modelParteleira = new ModelParteleira();
        // DaoTipo daoTipo = new DaoTipo();
        DaoParteleira daoParteleira = new DaoParteleira();

        modelParteleira.setIdParteleira(1);
        modelParteleira.setSecaoLivro("A1001");
        
        // insert.updateEditora(editora);
        daoParteleira.updateParteleira(modelParteleira);
    }

}
