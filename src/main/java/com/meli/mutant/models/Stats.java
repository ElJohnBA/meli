package com.meli.mutant.models;

import com.meli.mutant.data.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Stats extends BaseEntity implements Serializable {

    private int countMutantDna;
    private int countHumanDna;
    private float ratio;

}
