package com.meli.mutant.service;

public interface CheckMatrixService {

    boolean checkRows(char[][] matrix);

    boolean checkColumns(char[][] matrix);

    boolean checkMainDiagonal(char[][] matrix);

    boolean checkCounterDiagonal(char[][] matrix);
}
