package com.cockpit.cockpitbackend.adapters.output.repository;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.adapters.output.dto.PaginatedResponse;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class ServiceStatusInMemoryRepository implements ServiceStatusRepositoryPort {

    @Override
    public PaginatedResponse<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest) {
        List<ServiceStatus> services = new ArrayList<>();
        services.add(new ServiceStatus(111, "Banco de dados", "UP"));
        services.add(new ServiceStatus(112,"API de usuários", "DOWN"));
        services.add(new ServiceStatus(113,"Integração de ERP", "UP"));
        services.add(new ServiceStatus(114,"Interfaces", "DOWN"));
        services.add(new ServiceStatus(115, "Switches", "UP"));

        Stream<ServiceStatus> stream = services.stream();

        if (status != null) {
            stream = stream.filter(service -> service.getStatus().toLowerCase().contains(status.toLowerCase()));
        }
        if (name != null) {
            stream = stream.filter(service -> service.getName().toLowerCase().contains(name.toLowerCase()));
        }

        List<ServiceStatus> filtered = stream.collect(Collectors.toList());


        int page = paginationRequest.getPage();
        int size = paginationRequest.getSize();
        int offset = page * size;

        long totalElements = filtered.size();
        int totalPages = (size == 0) ? 0: (int) Math.ceil(((double) totalElements) / size);

        List<ServiceStatus> paginated = filtered.stream()
                .skip(offset)
                .limit(size)
                .collect(Collectors.toList());


        return PaginatedResponse.<ServiceStatus>builder()
                .content(paginated)
                .page(page)
                .size(size)
                .totalElements(totalElements)
                .totalPages(totalPages)
                .build();
    }


}