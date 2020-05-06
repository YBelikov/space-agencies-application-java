package com.ybelikov.spaceagencies.repositories;
import com.ybelikov.spaceagencies.domain.Agency;
import org.springframework.data.repository.CrudRepository;

public interface AgencyRepository extends CrudRepository<Agency, Long> {
}

