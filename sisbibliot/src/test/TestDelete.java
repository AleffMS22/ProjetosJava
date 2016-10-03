package test;

import dao.DaoParteleira;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.ModelParteleira;

/**
 *
 * @author aleff
 */
public class TestDelete {

    public static void main(String[] args) {
        // ModelEditora editora = new ModelEditora();
        // ModelTipo modelTipo = new ModelTipo();
        ModelParteleira modelParteleira = new ModelParteleira();
        // DaoEditora daoEditora = new DaoEditora();
        // DaoTipo daoTipo = new DaoTipo();
        DaoParteleira daoParteleira = new DaoParteleira();
        Scanner en = new Scanner(System.in);

        List<ModelParteleira> listaParteleiras = new ArrayList<ModelParteleira>();
        listaParteleiras = daoParteleira.selectParteleira();
        System.out.println("Informe o ID da Parteleira!!!");
        modelParteleira.setIdParteleira(en.nextInt());
        daoParteleira.deleteParteleira(modelParteleira);
    }

}
