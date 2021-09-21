package com.meli.mutant.service.impl;

import com.meli.mutant.models.Dna;
import com.meli.mutant.service.CheckMatrixService;
import com.meli.mutant.service.MutantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MutantServiceImpl implements MutantService {

    CheckMatrixService checkMatrixService;

    public MutantServiceImpl(CheckMatrixService checkMatrixService) {
        this.checkMatrixService = checkMatrixService;
    }

    @Override
    public boolean isMutant(Dna dna) {
        log.info("isMutant: starting..." );
        char [][] matrix = convertToMatrix(dna);
        log.info("isMutant: end..." );
        return checkMatrixService.checkRows(matrix)
                || checkMatrixService.checkColumns(matrix)
                || checkMatrixService.checkMainDiagonal(matrix)
                || checkMatrixService.checkCounterDiagonal(matrix);
    }

    char [][] convertToMatrix(Dna dna){
        log.info("convertToMatrix: starting..." );
        int rowSize = dna.getDnaList().size();
        char [][] matrix = new char[rowSize][rowSize];

        for(int i=0; i< rowSize;i++){
            matrix[i] = dna.getDnaList().get(i).toCharArray();
        }
        log.info("convertToMatrix: end..." );
        return matrix;
    }
}
