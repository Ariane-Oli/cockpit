package com.cockpit.cockpitbackend.adapters.output;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ServiceStatusInMemoryRepository implements ServiceStatusRepositoryPort {

    @Override
    public List<ServiceStatus> findServices(String name, String status){
        List<ServiceStatus> services = new ArrayList<>();
        services.add(new ServiceStatus("Banco de dados", "UP"));
        services.add(new ServiceStatus("API de usúarios", "Down"));
        services.add(new ServiceStatus("Integração de ERP", "UP"));


        Stream<ServiceStatus> stream = services.stream();

        if(status != null) {
            stream = stream.filter(service -> service.getStatus().toLowerCase().contains(status.toLowerCase()));
        }
        if(name != null){
            stream = stream.filter(service -> service.getName().toLowerCase().contains(name.toLowerCase()));
        }
        List<ServiceStatus> filtered = stream.collect(Collectors.toList());
        return filtered;

    }
}
