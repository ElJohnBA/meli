package com.meli.mutant.data.repository;

import com.meli.mutant.data.entity.StatsEntity;
import com.meli.mutant.models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StatsRepository extends JpaRepository<StatsEntity, Serializable> {
}
