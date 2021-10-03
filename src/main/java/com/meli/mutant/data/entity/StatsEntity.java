package com.meli.mutant.data.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DNA_TABLE")
public class StatsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private Integer codRuta;

    @Column(name = "COUNT_DNA_MUTANT")
    private int countMutantDna;

    @Column(name = "COUNT_DNA_HUMAN")
    private int countHumanDna;

}
