package com.ybelikov.spaceagencies.repositories;

import com.ybelikov.spaceagencies.domain.Astronaut;
import org.springframework.data.repository.CrudRepository;

public interface AstronautRepository extends CrudRepository<Astronaut, Long> {

}
