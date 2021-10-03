package com.meli.mutant.util.impl;

import com.meli.mutant.data.entity.StatsEntity;
import com.meli.mutant.models.Stats;
import com.meli.mutant.util.StatsTransformer;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StatsTransformerImpl implements StatsTransformer {

    @Override
    public List<Stats> getStatsList(List<StatsEntity> statsEntityList){

        return statsEntityList.stream()
                .map(transformAccount)
                .collect(Collectors.toList());
    }

    public Function<StatsEntity, Stats> transformAccount
            = statsEntity -> {

        Stats stats = new Stats();

        if(statsEntity!=null) {

            int countMutantDna = statsEntity.getCountMutantDna();
            int countHumanDna  = statsEntity.getCountHumanDna();

            stats.setCountMutantDna(countMutantDna);
            stats.setCountHumanDna(countHumanDna);
            stats.setRatio(countHumanDna == 0 ? 0 : (float) countMutantDna/countHumanDna);
            System.out.println(stats.getRatio());
        }
        return stats;
    };

}
