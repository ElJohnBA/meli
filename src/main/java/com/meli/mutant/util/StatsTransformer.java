package com.meli.mutant.util;

import com.meli.mutant.data.entity.StatsEntity;
import com.meli.mutant.models.Stats;

import java.util.List;

public interface StatsTransformer {

    public List<Stats> getStatsList(List<StatsEntity> statsEntityList);
}
