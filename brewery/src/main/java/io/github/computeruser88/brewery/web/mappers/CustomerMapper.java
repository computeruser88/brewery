package io.github.computeruser88.brewery.web.mappers;

import io.github.computeruser88.brewery.domain.Customer;
import io.github.computeruser88.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by Jan Balangue on 12/9/20.
 */
@Mapper
public interface CustomerMapper {

    CustomerDto CustomerToCustomerDto(Customer customer);
    Customer CustomerDtoToCustomer(CustomerDto dto);
}
