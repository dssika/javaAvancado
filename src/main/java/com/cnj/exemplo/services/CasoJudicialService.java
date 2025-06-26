package com.cnj.exemplo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cnj.exemplo.util.CasoJudicial;
import com.cnj.exemplo.util.CustoJudicial;
import com.cnj.exemplo.util.TaxaJudicial;

@Service
public class CasoJudicialService {

    private List<CasoJudicial> casos;

    public CasoJudicialService() {
        // Inicializar la lista de casos judiciales
        this.casos = new ArrayList<>();
        casos.add(new CasoJudicial(1L, 100, "Decisão A", new CustoJudicial(), new TaxaJudicial()));
        casos.add(new CasoJudicial(2L, 200, "Decisão B", new CustoJudicial(), new TaxaJudicial()));
        casos.add(new CasoJudicial(3L, 300, "Decisão C", new CustoJudicial(), new TaxaJudicial()));
    }

    public List<CasoJudicial> getAllCasos() {
        return casos;
    }

    public CasoJudicial pegarCasoPorId(Long id) {
        return casos.stream()
                .filter(caso -> caso.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void criarCaso(CasoJudicial novoCaso) {
        novoCaso.setId((long) (casos.size() + 1)); // Atribui um ID único
        casos.add(novoCaso);
    }
    
}
