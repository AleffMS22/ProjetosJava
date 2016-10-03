package model;

/**
 * Classe responsável pela modelagem do objeto livro
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelLivro {

    private int idLivro;
    private String tituloLivro;
    private String autorLivro;
    private int qtdeLivros;
    private ModelEditora modelEditora;
    private ModelTipo modelTipo;
    private ModelParteleira modelParteleira;

    public ModelLivro() {
    }

    public ModelLivro(int idLivro, String tituloLivro, String autorLivro, int qtdeLivros, ModelEditora modelEditora, ModelTipo modelTipo, ModelParteleira modelParteleira) {
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.qtdeLivros = qtdeLivros;
        this.modelEditora = modelEditora;
        this.modelTipo = modelTipo;
        this.modelParteleira = modelParteleira;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getQtdeLivros() {
        return qtdeLivros;
    }

    public void setQtdeLivros(int qtdeLivros) {
        this.qtdeLivros = qtdeLivros;
    }

    public ModelEditora getModelEditora() {
        return modelEditora;
    }

    public void setModelEditora(ModelEditora modelEditora) {
        this.modelEditora = modelEditora;
    }

    public ModelTipo getModelTipo() {
        return modelTipo;
    }

    public void setModelTipo(ModelTipo modelTipo) {
        this.modelTipo = modelTipo;
    }

    public ModelParteleira getModelParteleira() {
        return modelParteleira;
    }

    public void setModelParteleira(ModelParteleira modelParteleira) {
        this.modelParteleira = modelParteleira;
    }
    
    

  
}
