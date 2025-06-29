package com.cockpit.cockpitbackend.controller;

import com.cockpit.cockpitbackend.model.ServiceStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ServiceStatusController {

    @GetMapping("/services")
       public List<ServiceStatus> getServices(@RequestParam(required = false)String name, @RequestParam(required = false)String status) {
        List<ServiceStatus>  services = new ArrayList<>();

        services.add(new ServiceStatus("Banco de dados", "UP"));
        services.add(new ServiceStatus("API de usuários", "DOWN"));
        services.add(new ServiceStatus("Integração de Erp", "UP"));

        services.stream().filter(service -> service.getStatus().equals("UP"))
                .collect(Collectors.toList());

        return services;



    }
}
