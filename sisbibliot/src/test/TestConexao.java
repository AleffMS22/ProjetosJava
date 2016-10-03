package test;

import util.GerenciaConexoesMySql;

/**
 *
 * @author aleff
 */
public class TestConexao {

    public static void main(String[] args) {
        GerenciaConexoesMySql conectado = new GerenciaConexoesMySql();
        conectado.conectarMySql();
        conectado.desconectaMySql();
        conectado.conectarMySql();

    }

}
