package com.meli.mutant.util.impl;

import com.meli.mutant.exception.ServiceException;
import com.meli.mutant.models.Dna;
import com.meli.mutant.util.UtilService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UtilServiceImpl implements UtilService {

    private static final Pattern DNA_PATTERN = Pattern.compile("[atcg]+", Pattern.CASE_INSENSITIVE);

    public void validateStructure(Dna dna) {

        if(dna.getDnaList() == null){
            Error error = new Error("Dna list is null");
            throw new ServiceException(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        int dnaSize = dna.getDnaList().size();
        int dnaFiltered = (int) dna.getDnaList().stream()
                .filter( f -> DNA_PATTERN.matcher(f).matches() )
                .count();

        if(dnaSize != dnaFiltered){
            Error error = new Error("Incorrect structure inside dna");
            throw new ServiceException(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
