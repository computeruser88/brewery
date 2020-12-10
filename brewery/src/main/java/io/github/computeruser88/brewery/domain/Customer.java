package io.github.computeruser88.brewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Jan Balangue on 12/9/20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private UUID id;

    private String customerName;
}
