package com.ybelikov.spaceagencies.repositories;

import com.ybelikov.spaceagencies.domain.Mission;
import org.springframework.data.repository.CrudRepository;

public interface MissionRepository extends CrudRepository<Mission, Long> {
}
