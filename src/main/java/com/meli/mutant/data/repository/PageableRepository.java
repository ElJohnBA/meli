package com.meli.mutant.data.repository;

import java.util.List;

public interface PageableRepository<T> {
    List<T> list (int from, int to, List<T> list);
}
