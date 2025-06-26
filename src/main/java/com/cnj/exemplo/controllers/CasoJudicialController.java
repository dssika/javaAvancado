package com.cnj.exemplo.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnj.exemplo.services.CasoJudicialService;
import com.cnj.exemplo.util.CasoJudicial;



@RestController
@RequestMapping("/api/casos")
public class CasoJudicialController {

    private final CasoJudicialService casoJudicialService;
    
    public CasoJudicialController(CasoJudicialService casoJudicialService) {
        this.casoJudicialService = casoJudicialService;
    }

    @GetMapping
    public ResponseEntity<List<CasoJudicial>> getAllCasos() {
        List<CasoJudicial> casos = casoJudicialService.getAllCasos();
        return ResponseEntity.ok(casos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CasoJudicial> getCasoById(@PathVariable Long id) {
        CasoJudicial caso = casoJudicialService.pegarCasoPorId(id);
        if (caso != null) {
            return ResponseEntity.ok(caso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<CasoJudicial> criarCaso(@RequestBody CasoJudicial novoCaso) {
        casoJudicialService.criarCaso(novoCaso);        
        return ResponseEntity .status(HttpStatusCode.valueOf(201)).body(novoCaso);
    }
}
