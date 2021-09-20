package com.meli.mutant.service.impl;

import java.util.Arrays;
import java.util.List;

import com.meli.mutant.models.Dna;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MutantServiceImplTest {

    MutantServiceImpl mutantService = new MutantServiceImpl();

    @Test
    void isMutant() throws Exception {
        List<String> dnaList = Arrays.asList("ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG");
        Dna dna = new Dna(dnaList);
        assertThat(mutantService.isMutant(dna)).isTrue();
    }

}