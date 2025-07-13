package com.cockpit.cockpitbackend.adapters.output;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class ServiceStatusInMemoryRepository implements ServiceStatusRepositoryPort {

    @Override
    public List<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest) {
        List<ServiceStatus> services = new ArrayList<>();
        services.add(new ServiceStatus("Banco de dados", "UP"));
        services.add(new ServiceStatus("API de usúarios", "Down"));
        services.add(new ServiceStatus("Integração de ERP", "UP"));


        Stream<ServiceStatus> stream = services.stream();

        if (status != null) {
            stream = stream.filter(service -> service.getStatus().toLowerCase().contains(status.toLowerCase()));
        }
        if (name != null) {
            stream = stream.filter(service -> service.getName().toLowerCase().contains(name.toLowerCase()));
        }

        return stream.collect(Collectors.toList());

    }

}