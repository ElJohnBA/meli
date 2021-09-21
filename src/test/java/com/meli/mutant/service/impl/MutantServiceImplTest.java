package com.meli.mutant.service.impl;

import java.util.Arrays;
import java.util.List;

import com.meli.mutant.models.Dna;
import com.meli.mutant.service.CheckMatrixService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
class MutantServiceImplTest {

    @Mock
    CheckMatrixService checkMatrixService;

    MutantServiceImpl mutantService;

    @BeforeEach
    void init() {
        mutantService = new MutantServiceImpl(checkMatrixService);
    }

    @Test
    void isMutant() throws Exception {
        char [][] matrix = new char[0][];
        lenient().when(checkMatrixService.checkRows(matrix)).thenReturn(true);
        lenient().when(checkMatrixService.checkColumns(matrix)).thenReturn(true);
        lenient().when(checkMatrixService.checkMainDiagonal(matrix)).thenReturn(true);
        lenient().when(checkMatrixService.checkCounterDiagonal(matrix)).thenReturn(true);

        List<String> dnaList = Arrays.asList("ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG");
        Dna dna = new Dna(dnaList);
        assertThat(mutantService.isMutant(dna)).isTrue();
    }

}