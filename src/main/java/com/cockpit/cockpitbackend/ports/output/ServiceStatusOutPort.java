package com.cockpit.cockpitbackend.ports.output;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;

import java.util.List;

public interface ServiceStatusOutPort {
    List<ServiceStatus> findAll();
}
