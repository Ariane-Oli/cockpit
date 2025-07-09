package com.cockpit.cockpitbackend.adapters.input.controller;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.input.ServiceStatusUseCasePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ServiceStatusController {

    private final ServiceStatusUseCasePort serviceStatusUseCasePort;

    public ServiceStatusController(ServiceStatusUseCasePort serviceStatusUseCasePort){
        this.serviceStatusUseCasePort = serviceStatusUseCasePort;
    }
    @GetMapping("/services")
       public List<ServiceStatus> getServices(@RequestParam(required = false)String name, @RequestParam(required = false)String status){

        return serviceStatusUseCasePort.findServices(name,status);



    }
}
