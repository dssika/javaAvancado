package com.cnj.exemplo.main.util;

import org.springframework.stereotype.Component;

@Component
public class CustoJudicial {

    public double adicionaCusto (int ano){
        if (ano >= 2024)
            return 20.0; // Valor para anos a partir de 2024
        return 10.0;
    }
    
}
