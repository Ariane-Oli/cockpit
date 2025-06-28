package com.cockpit.cockpitbackend.controller;

import com.cockpit.cockpitbackend.model.ServiceStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceStatusController {

    @GetMapping("/services")
       public List<ServiceStatus> getServices() {
        List<ServiceStatus>  services = new ArrayList<>();
        services.add(new ServiceStatus("Banco de dados", "UP"));
        services.add(new ServiceStatus("API de usuários", "Down"));
        services.add(new ServiceStatus("Integração de Erp", "UP"));

        return services;



    }
}
