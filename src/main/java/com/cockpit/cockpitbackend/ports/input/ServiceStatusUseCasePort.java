package com.cockpit.cockpitbackend.ports.input;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;

import java.util.List;

public interface ServiceStatusUseCasePort {
    List<ServiceStatus> findServices(String name, String status);
}
