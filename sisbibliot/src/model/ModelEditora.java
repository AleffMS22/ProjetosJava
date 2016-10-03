package model;

/**
 * Classe responsável pela modelagem do objeto editora.
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelEditora {

    private int idEditora;
    private String nomeEditora;
    private String anoPublicacao;

    public ModelEditora() {
    }

    public ModelEditora(int idEditora, String nomeEditora, String anoPublicacao) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.anoPublicacao = anoPublicacao;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     *
     * @param anoPublicacao
     */
    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}
