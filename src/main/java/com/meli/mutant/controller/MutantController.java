package com.meli.mutant.controller;

import com.meli.mutant.models.Dna;
import com.meli.mutant.service.MutantService;
import com.meli.mutant.util.UtilService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/muntant/v1")
public class MutantController {

    private MutantService mutantService;
    private UtilService utilService;

    public MutantController(MutantService mutantService, UtilService utilService) {
        this.mutantService = mutantService;
        this.utilService = utilService;
    }

    @PostMapping("/ismutant")
    public ResponseEntity<Boolean> isMutant(@RequestBody Dna dna) {

        log.info("isMutant: starting..." );
        utilService.validateStructure(dna);
        boolean isMutant = mutantService.isMutant(dna);

        log.info("isMutant: end..." );
        if (isMutant) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(false, HttpStatus.FORBIDDEN);
        }
    }

}
