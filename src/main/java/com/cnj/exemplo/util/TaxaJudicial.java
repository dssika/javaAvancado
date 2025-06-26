package com.cnj.exemplo.util;

import org.springframework.stereotype.Component;

@Component
public class TaxaJudicial {

    public double adicionarTaxa(String estado){
        if ("DF".equals(estado))
            return 10.0; 
        return 20.0;
    }
    
}
