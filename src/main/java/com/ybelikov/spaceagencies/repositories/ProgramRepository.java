package com.ybelikov.spaceagencies.repositories;

import org.springframework.data.repository.CrudRepository;
import com.ybelikov.spaceagencies.domain.Program;

public interface ProgramRepository extends CrudRepository<Program, Long> {
}
