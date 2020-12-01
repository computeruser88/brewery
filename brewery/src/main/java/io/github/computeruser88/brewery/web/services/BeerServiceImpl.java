package io.github.computeruser88.brewery.web.services;

import io.github.computeruser88.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
/**
 * Created by Jan Balangue on 2020-11-30.
 */
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
