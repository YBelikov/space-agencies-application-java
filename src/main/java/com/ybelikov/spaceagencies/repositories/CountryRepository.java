package com.ybelikov.spaceagencies.repositories;

import com.ybelikov.spaceagencies.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
