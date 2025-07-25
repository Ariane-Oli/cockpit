package com.cockpit.cockpitbackend.adapters.input.controller;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.adapters.output.dto.PaginatedResponse;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.input.ServiceStatusUseCasePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/services")
public class ServiceStatusController {

    private final ServiceStatusUseCasePort serviceStatusUseCasePort;
@Autowired
    public ServiceStatusController(ServiceStatusUseCasePort serviceStatusUseCasePort){
        this.serviceStatusUseCasePort = serviceStatusUseCasePort;
    }
    @GetMapping
       public PaginatedResponse<ServiceStatus> getServices(
               @RequestParam(required = false)String name,
               @RequestParam(required = false)String status,
               @ModelAttribute PaginationRequest paginationRequest){

       PaginatedResponse<ServiceStatus> response = serviceStatusUseCasePort.findServices(name, status, paginationRequest);
        return response;



    }
}
