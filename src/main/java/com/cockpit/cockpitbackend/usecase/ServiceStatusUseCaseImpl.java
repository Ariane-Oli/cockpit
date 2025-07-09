package com.cockpit.cockpitbackend.usecase;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.input.ServiceStatusUseCasePort;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;

import java.util.List;

public class ServiceStatusUseCaseImpl implements ServiceStatusUseCasePort {

    private final ServiceStatusRepositoryPort serviceStatusRepositoryPort;
@Override
   public List<ServiceStatus> findServices(String name, String status){

    return serviceStatusRepositoryPort.findServices(name, status);
}

         public ServiceStatusUseCaseImpl(ServiceStatusRepositoryPort serviceStatusRepositoryPort){
              this.serviceStatusRepositoryPort = serviceStatusRepositoryPort;
          }
}
