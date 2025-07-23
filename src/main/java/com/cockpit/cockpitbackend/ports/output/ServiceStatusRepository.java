package com.cockpit.cockpitbackend.ports.output;

import com.cockpit.cockpitbackend.adapters.output.persistence.entity.ServiceStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceStatusRepository extends JpaRepository<ServiceStatusEntity, Integer> {

}
