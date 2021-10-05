package com.meli.mutant.service.impl;

import com.meli.mutant.data.repository.StatsRepository;
import com.meli.mutant.util.StatsTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class StatsServiceImplTest {

    @Mock StatsRepository statsRepository;
    @Mock StatsTransformer statsTransformer;

    StatsServiceImpl statsService;

    @BeforeEach
    void setUp() {
        statsService = new StatsServiceImpl(statsRepository,statsTransformer);
    }

    @Test
    void getStats() {
        statsService.getStats();
    }

}