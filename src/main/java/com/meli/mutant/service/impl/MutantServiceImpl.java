package com.meli.mutant.service.impl;

import com.meli.mutant.models.Dna;
import com.meli.mutant.service.MutantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MutantServiceImpl implements MutantService {

    @Override
    public boolean isMutant(Dna dna) {
        log.info("isMutant: starting..." );

        int rowSize = dna.getDnaList().size();
        char [][] matrix = new char[rowSize][rowSize];

        for(int i=0; i< rowSize;i++){
            matrix[i] = dna.getDnaList().get(i).toCharArray();
        }

        log.info("isMutant: end..." );
        return checkRows(matrix) || checkColumns(matrix) || checkMainDiagonal(matrix) || checkCounterDiagonal(matrix);
    }

    private boolean checkRows(char[][] matrix){
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
        return false;
    }

    private static boolean checkColumns(char[][] matrix){
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
        return false;
    }

    private static boolean checkMainDiagonal(char[][] matrix) {
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
        return false;
    }

    private static boolean checkCounterDiagonal(char[][] matrix){
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
        return false;
    }

}
