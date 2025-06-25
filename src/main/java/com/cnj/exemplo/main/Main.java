package com.cnj.exemplo.main;

import com.cnj.exemplo.main.util.CasoJudicial;
import com.cnj.exemplo.main.util.CustoJudicial;
import com.cnj.exemplo.main.util.TaxaJudicial;

public class Main {

    public static void main(String[] args) {
        CasoJudicial caso = new CasoJudicial(new CustoJudicial(), new TaxaJudicial());
        caso.finalizarCusto(100, "RJ", 2025);  
    }
    
}
