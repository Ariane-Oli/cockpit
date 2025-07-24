package com.cockpit.cockpitbackend.adapters.output.persistence.adapter;


import com.cockpit.cockpitbackend.adapters.output.persistence.entity.ServiceStatusEntity;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusOutPort;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class ServiceStatusAdapterOut implements ServiceStatusOutPort {

    private final ServiceStatusRepository repository;

    public ServiceStatusAdapterOut(ServiceStatusRepository repository){
        this.repository = repository;
    }

    @Override
    public List<ServiceStatus> findAll(){
        return repository.findAll().stream()
                .map(this::toDomainModel)
                .collect(Collectors.toList());
    }

    public ServiceStatus toDomainModel(ServiceStatusEntity entity){
        return new ServiceStatus(entity.getId(), entity.getName(), entity.getStatus());

    }
}
