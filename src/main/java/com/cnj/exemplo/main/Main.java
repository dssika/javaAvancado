package com.cnj.exemplo.main;

import com.cnj.exemplo.util.CasoJudicial;
import com.cnj.exemplo.util.CustoJudicial;
import com.cnj.exemplo.util.TaxaJudicial;

public class Main {

    public static void main(String[] args) {
        CasoJudicial caso = new CasoJudicial(1L, 100, "Decisão A", new CustoJudicial(), new TaxaJudicial());
        caso.finalizarCusto(100, "RJ", 2025);  
    }
    
}
