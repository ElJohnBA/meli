package com.meli.mutant.service.impl;

import com.meli.mutant.data.entity.StatsEntity;
import com.meli.mutant.data.repository.ListHelperRepositoryImpl;
import com.meli.mutant.data.repository.StatsRepository;
import com.meli.mutant.models.Stats;
import com.meli.mutant.service.StatsService;
import com.meli.mutant.util.StatsTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StatsServiceImpl implements StatsService {

    private StatsRepository statsRepository;
    private StatsTransformer statsTransformer;
    private ListHelperRepositoryImpl listHelper;

    public StatsServiceImpl(StatsRepository statsRepository, StatsTransformer statsTransformer,
                            ListHelperRepositoryImpl listHelper) {
        this.statsRepository = statsRepository;
        this.statsTransformer = statsTransformer;
        this.listHelper = listHelper;
    }

    @Override
    public List<Stats> getStats() {
        List<StatsEntity> resultEntities = statsRepository.findAll();
        return statsTransformer.getStatsList(resultEntities);
    }

    public List<Stats> getPageableStats() {
        List<StatsEntity> resultEntities = statsRepository.findAll();
        return null; //TODO: NEED IMPLEMENTATION
    }

}
