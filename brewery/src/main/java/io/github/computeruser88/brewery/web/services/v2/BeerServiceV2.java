package io.github.computeruser88.brewery.web.services.v2;

import io.github.computeruser88.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by Jan Balangue on 2020-12-03.
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
