package io.github.computeruser88.brewery.web.mappers;

import io.github.computeruser88.brewery.domain.Beer;
import io.github.computeruser88.brewery.web.model.BeerDto;
import io.github.computeruser88.brewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Created by Jan Balangue on 12/9/20.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
