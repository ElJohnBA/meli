package com.meli.mutant.service.impl;

import com.meli.mutant.service.CheckMatrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CheckMatrixServiceImpl implements CheckMatrixService {

     public boolean checkRows(char[][] matrix){
        log.info("checkRows: starting..." );
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length - 3; col++){
                char element = matrix[row][col];
                if (element == matrix[row][col + 1] &&
                        element == matrix[row][col + 2] &&
                        element == matrix[row][col + 3]){
                    return true;
                }
            }
        }
        log.info("checkRows: end..." );
        return false;
    }

     public boolean checkColumns(char[][] matrix){
        log.info("checkColumns: starting..." );
        for (int row = 0; row < matrix.length - 3; row++){
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                if (element == matrix[row + 1][col] &&
                        element == matrix[row + 2][col] &&
                        element == matrix[row + 3][col]){
                    return true;
                }
            }
        }
        log.info("checkColumns: end..." );
        return false;
    }

    public boolean checkMainDiagonal(char[][] matrix) {
        log.info("checkMainDiagonal: starting..." );
        for (int row = 0; row < matrix.length - 3; row++){
            for (int col = 0; col < matrix[row].length - 3; col++) {
                int element = matrix[row][col];
                if (element == matrix[row + 1][col + 1] &&
                        element == matrix[row + 2][col + 2] &&
                        element == matrix[row + 3][col + 3]){
                    return true;
                }
            }
        }
        log.info("checkMainDiagonal: end..." );
        return false;
    }

    public boolean checkCounterDiagonal(char[][] matrix){
        log.info("checkCounterDiagonal: start..." );
        for (int row = 0; row < matrix.length - 3; row++){
            for (int col = 3; col < matrix[row].length; col++){
                int element = matrix[row][col];
                if (element == matrix[row + 1][col - 1] &&
                        element == matrix[row + 2][col - 2] &&
                        element == matrix[row + 3][col - 3]){
                    return true;
                }
            }
        }
        log.info("checkCounterDiagonal: end..." );
        return false;
    }
}
