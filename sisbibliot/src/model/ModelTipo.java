package model;

/**
 * Classe responsável pela modelagem do objetp tipo
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelTipo {

    private int idTipo;
    private String tipoLivro;
    private String tipoDescricao;

    public ModelTipo() {
    }

    public ModelTipo(int idTipo, String tipoLivro, String tipoDescricao) {
        this.idTipo = idTipo;
        this.tipoLivro = tipoLivro;
        this.tipoDescricao = tipoDescricao;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipoLivro() {
        return tipoLivro;
    }

    public void setTipoLivro(String tipoLivro) {
        this.tipoLivro = tipoLivro;
    }

    public String getTipoDescricao() {
        return tipoDescricao;
    }

    public void setTipoDescricao(String tipoDescricao) {
        this.tipoDescricao = tipoDescricao;
    }

}
