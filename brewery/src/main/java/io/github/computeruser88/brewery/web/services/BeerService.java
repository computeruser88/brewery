package io.github.computeruser88.brewery.web.services;

import io.github.computeruser88.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
