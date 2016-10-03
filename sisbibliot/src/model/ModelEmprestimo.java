package model;

/**
 * Classe responsável pela modelagem do objeto Emprestimo
 *
 * @access public
 * @author Aleff
 * @since 26/09/2016
 * @package model
 * @version 1.0
 *
 */
public class ModelEmprestimo {

    private String dataEmprestimo; // id da tb_emprestimo
    private double valorMulta;
    private String dataDevolucao;
    private int qtdeLivrosEmprestados;
    private int funcionarioIDfuncionario;
    private int livroIDlivro;
    private int editoraIDeditora;
    private int tipoIDtipo;
    private int parteleiraIDparteleira;
    private int alunoIDaluno;

    public ModelEmprestimo() {
    }

    public ModelEmprestimo(String dataEmprestimo, double valorMulta, String dataDevolucao, int qtdeLivrosEmprestados, int funcionarioIDfuncionario, int livroIDlivro, int editoraIDeditora, int tipoIDtipo, int parteleiraIDparteleira, int alunoIDaluno) {
        this.dataEmprestimo = dataEmprestimo;
        this.valorMulta = valorMulta;
        this.dataDevolucao = dataDevolucao;
        this.qtdeLivrosEmprestados = qtdeLivrosEmprestados;
        this.funcionarioIDfuncionario = funcionarioIDfuncionario;
        this.livroIDlivro = livroIDlivro;
        this.editoraIDeditora = editoraIDeditora;
        this.tipoIDtipo = tipoIDtipo;
        this.parteleiraIDparteleira = parteleiraIDparteleira;
        this.alunoIDaluno = alunoIDaluno;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getQtdeLivrosEmprestados() {
        return qtdeLivrosEmprestados;
    }

    public void setQtdeLivrosEmprestados(int qtdeLivrosEmprestados) {
        this.qtdeLivrosEmprestados = qtdeLivrosEmprestados;
    }

    public int getFuncionarioIDfuncionario() {
        return funcionarioIDfuncionario;
    }

    public void setFuncionarioIDfuncionario(int funcionarioIDfuncionario) {
        this.funcionarioIDfuncionario = funcionarioIDfuncionario;
    }

    public int getLivroIDlivro() {
        return livroIDlivro;
    }

    public void setLivroIDlivro(int livroIDlivro) {
        this.livroIDlivro = livroIDlivro;
    }

    public int getEditoraIDeditora() {
        return editoraIDeditora;
    }

    public void setEditoraIDeditora(int editoraIDeditora) {
        this.editoraIDeditora = editoraIDeditora;
    }

    public int getTipoIDtipo() {
        return tipoIDtipo;
    }

    public void setTipoIDtipo(int tipoIDtipo) {
        this.tipoIDtipo = tipoIDtipo;
    }

    public int getParteleiraIDparteleira() {
        return parteleiraIDparteleira;
    }

    public void setParteleiraIDparteleira(int parteleiraIDparteleira) {
        this.parteleiraIDparteleira = parteleiraIDparteleira;
    }

    public int getAlunoIDaluno() {
        return alunoIDaluno;
    }

    public void setAlunoIDaluno(int alunoIDaluno) {
        this.alunoIDaluno = alunoIDaluno;
    }

}
