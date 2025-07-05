package com.cockpit.cockpitbackend.ports.output;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;

import java.util.List;

public interface ServiceStatusRepositoryPort {
    List<ServiceStatus> findServices(String name, String status);
}
