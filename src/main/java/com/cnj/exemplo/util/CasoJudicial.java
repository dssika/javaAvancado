package com.cnj.exemplo.util;

import org.springframework.stereotype.Component;

@Component
public class CasoJudicial {

    private CustoJudicial custoJudicial;
    private TaxaJudicial taxaJudicial;
    private Long id;
    
    private Integer numero;
    private String decisao;
    
    // Construtor padrão necessário para o Spring
    public CasoJudicial() {}
    
    public CasoJudicial(CustoJudicial custo, TaxaJudicial taxa) {
        this.custoJudicial = custo;
        this.taxaJudicial = taxa;
    }
    
    public CasoJudicial(Long id, Integer numero, String decisao, CustoJudicial custoJudicial2, TaxaJudicial taxaJudicial2) {
        this.id = id;
        this.numero = numero;
        this.decisao = decisao;
        this.custoJudicial = custoJudicial2;
        this.taxaJudicial = taxaJudicial2;
    }
    
    public double finalizarCusto(double custo, String estado, int anoJulgamento) {
        if (custoJudicial != null) {
            custo += custoJudicial.adicionaCusto(anoJulgamento);
        }
        if (taxaJudicial != null) {
            custo += taxaJudicial.adicionarTaxa(estado);
        }
        return custo;
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getDecisao() {
        return decisao;
    }
    
    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
}
