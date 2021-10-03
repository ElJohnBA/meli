package com.meli.mutant.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Stats implements Serializable {

    private int countMutantDna;
    private int countHumanDna;
    private float ratio;

}
