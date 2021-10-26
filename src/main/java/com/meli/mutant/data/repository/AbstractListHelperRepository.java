package com.meli.mutant.data.repository;


import com.meli.mutant.data.entity.BaseEntity;

import java.util.List;

public abstract class AbstractListHelperRepository<T extends BaseEntity> implements GeneralInterface<T>{

    @Override
    public List<T> list(int from, int to, List<T> list) {
        return list.subList(from,to);
    }
}
