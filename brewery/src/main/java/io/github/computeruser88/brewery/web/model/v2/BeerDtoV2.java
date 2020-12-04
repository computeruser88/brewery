package io.github.computeruser88.brewery.web.model.v2;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Jan Balangue on 2020-12-03.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

}
