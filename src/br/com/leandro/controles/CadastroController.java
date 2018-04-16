/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.leandro.controles;

import br.com.leandro.entidades.Produto;

/**
 *
 * @author leandro
 */
public class CadastroController {

    public boolean cadastrarProduto(Produto p) {
        boolean result = false;

        if (p != null && p.getNome().length() > 0
                && p.getEspecificacoes().length() > 0 && p.getPrecoCusto() > 0
                && p.getPrecoVenda() > 0 ) {
            result = true;
        }
        return result;
    }

}
