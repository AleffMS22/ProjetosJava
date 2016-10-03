package model;

/**
 * Classe responsável pela modelagem do objeto parteleira
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelParteleira {

    private int idParteleira;
    private String secaoLivro;

    public ModelParteleira() {
    }

    public ModelParteleira(int idParteleira, String secaoLivro) {
        this.idParteleira = idParteleira;
        this.secaoLivro = secaoLivro;
    }

    public int getIdParteleira() {
        return idParteleira;
    }

    public void setIdParteleira(int idParteleira) {
        this.idParteleira = idParteleira;
    }

    public String getSecaoLivro() {
        return secaoLivro;
    }

    public void setSecaoLivro(String secaoLivro) {
        this.secaoLivro = secaoLivro;
    }

}
