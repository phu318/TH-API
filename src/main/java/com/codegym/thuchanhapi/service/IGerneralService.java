package com.codegym.thuchanhapi.service;

import java.util.Optional;

public interface IGerneralService<E> {
    Iterable<E> findAll();

    Optional<E> findById(Long id);

    E save(E e);

    void remove(Long id);
}
