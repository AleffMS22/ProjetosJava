package test;

// import model.ModelEditora;
// import dao.DaoEditora;
import dao.DaoParteleira;
import java.text.ParseException;
import model.ModelParteleira;

/**
 *
 * @author aleff
 */
public class TestInsert {

    public static void main(String[] args) throws ParseException {
        // ModelEditora editora = new ModelEditora();
        // ModelTipo modelTipo = new ModelTipo();
        ModelParteleira modelParteleira = new ModelParteleira();
        // DaoEditora insert = new DaoEditora();
        //DaoTipo daoTipo = new DaoTipo();
        DaoParteleira daoPartileira = new DaoParteleira();

        modelParteleira.setSecaoLivro("A339");
        //modelTipo.setTipoDescricao("Blá Blá Blá");
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/mm/dd");

        // DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        // Date data = (Date) simpleDateFormat.parse("2016/05/12");
        // insert.insertEditora(editora);
        daoPartileira.insertPartileira(modelParteleira);

    }

}
