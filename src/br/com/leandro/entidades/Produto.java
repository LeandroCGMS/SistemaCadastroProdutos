/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.leandro.entidades;

/**
 *
 * @author leandro
 */
public class Produto {
    //atributos
    private int codigo;
    private String nome;
    private String especificacoes;
    private float precoVenda;
    private float precoCusto;
    private boolean habilitadoVendas;

    public Produto(String nome, String especificacoes, float precoVenda, float precoCusto, boolean habilitadoVendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitadoVendas = habilitadoVendas;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especificacoes
     */
    public String getEspecificacoes() {
        return especificacoes;
    }

    /**
     * @param especificacoes the especificacoes to set
     */
    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    /**
     * @return the precoVenda
     */
    public float getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the precoCusto
     */
    public float getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the habilitadoVendas
     */
    public boolean isHabilitadoVendas() {
        return habilitadoVendas;
    }

    /**
     * @param habilitadoVendas the habilitadoVendas to set
     */
    public void setHabilitadoVendas(boolean habilitadoVendas) {
        this.habilitadoVendas = habilitadoVendas;
    }
    
    
}
