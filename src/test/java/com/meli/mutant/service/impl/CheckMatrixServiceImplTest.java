package com.meli.mutant.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckMatrixServiceImplTest {

    CheckMatrixServiceImpl checkMatrixService;
    char [][] matrix =  new char[6][6];

    @BeforeEach
    void setUp() {
        checkMatrixService = new CheckMatrixServiceImpl();

        matrix[0] = "ATGCGA".toCharArray();
        matrix[1] = "CAGTGC".toCharArray();
        matrix[2] = "TTATGT".toCharArray();
        matrix[3] = "AGAAGG".toCharArray();
        matrix[4] = "CCCCTA".toCharArray();
        matrix[5] = "TCACTG".toCharArray();
    }

    @Test
    void checkRows() {
        boolean result = checkMatrixService.checkRows(matrix);
        assertThat(result).isTrue();
    }

    @Test
    void checkColumns() {
        boolean result = checkMatrixService.checkColumns(matrix);
        assertThat(result).isTrue();
    }

    @Test
    void checkMainDiagonal() {
        boolean result = checkMatrixService.checkMainDiagonal(matrix);
        assertThat(result).isTrue();
    }

    @Test
    void checkCounterDiagonal() {
        boolean result = checkMatrixService.checkCounterDiagonal(matrix);
        assertThat(result).isFalse();
    }
}