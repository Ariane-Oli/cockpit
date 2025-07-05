package com.cockpit.cockpitbackend.adapters.input.controller;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ServiceStatusController {

    @GetMapping("/services")
       public List<ServiceStatus> getServices(@RequestParam(required = false)String name, @RequestParam(required = false)String status) {
        List<ServiceStatus>  services = new ArrayList<>();

        // 1- Adicionando os serviços
        services.add(new ServiceStatus("Banco de dados", "UP"));
        services.add(new ServiceStatus("API de usuários", "DOWN"));
        services.add(new ServiceStatus("Integração de Erp", "UP"));

        // 2- Cria stream a partir da lista já preenchida
        Stream<ServiceStatus> stream = services.stream();

       if(status != null) {
           stream = stream.filter(service -> service.getStatus().equalsIgnoreCase(status));
       }

       if (name != null){
           stream = stream.filter(service -> service.getName().toLowerCase().contains(name.toLowerCase()));
       }

       // mais filtros aqui
       List<ServiceStatus> filtered = stream.collect(Collectors.toList());
        return filtered;



    }
}
