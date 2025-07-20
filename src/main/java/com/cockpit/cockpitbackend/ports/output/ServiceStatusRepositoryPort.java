package com.cockpit.cockpitbackend.ports.output;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.adapters.output.dto.PaginatedResponse;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceStatusRepositoryPort {
    PaginatedResponse<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest);
}
