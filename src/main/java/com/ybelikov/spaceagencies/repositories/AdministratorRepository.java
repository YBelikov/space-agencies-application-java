package com.ybelikov.spaceagencies.repositories;

import com.ybelikov.spaceagencies.domain.Administrator;
import org.springframework.data.repository.CrudRepository;

public interface AdministratorRepository extends CrudRepository<Administrator, Long> {
}
