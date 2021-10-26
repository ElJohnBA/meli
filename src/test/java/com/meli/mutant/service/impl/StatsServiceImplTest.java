package com.meli.mutant.service.impl;

import com.meli.mutant.data.repository.ListHelperRepositoryImpl;
import com.meli.mutant.data.repository.StatsRepository;
import com.meli.mutant.util.StatsTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class StatsServiceImplTest {

    @Mock StatsRepository statsRepository;
    @Mock StatsTransformer statsTransformer;
    @Mock
    ListHelperRepositoryImpl listHelper;

    StatsServiceImpl statsService;

    @BeforeEach
    void setUp() {
        statsService = new StatsServiceImpl(statsRepository,statsTransformer,listHelper);
    }

    @Test
    void getStats() {
        statsService.getStats();
    }

}