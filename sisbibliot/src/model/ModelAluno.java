package model;

/**
 * Classe responsável pela modelagem do objeto aluno
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelAluno {

    private int idAluno;
    private String nomeAluno;
    private String cursoAluno;
    private String enderecoAluno;
    private String cidadeAluno;
    private String telefoneAluno;

    public ModelAluno() {
    }

    public ModelAluno(int idAluno, String nomeAluno, String cursoAluno, String enderecoAluno, String cidadeAluno, String telefoneAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.cursoAluno = cursoAluno;
        this.enderecoAluno = enderecoAluno;
        this.cidadeAluno = cidadeAluno;
        this.telefoneAluno = telefoneAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public void setCidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

}
