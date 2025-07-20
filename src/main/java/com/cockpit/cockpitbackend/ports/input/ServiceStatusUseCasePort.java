package com.cockpit.cockpitbackend.ports.input;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.adapters.output.dto.PaginatedResponse;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;



public interface ServiceStatusUseCasePort {
    PaginatedResponse<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest);
}
