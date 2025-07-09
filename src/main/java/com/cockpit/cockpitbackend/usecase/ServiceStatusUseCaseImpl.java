package com.cockpit.cockpitbackend.usecase;

import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.input.ServiceStatusUseCasePort;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ServiceStatusUseCaseImpl implements ServiceStatusUseCasePort {

    private final ServiceStatusRepositoryPort serviceStatusRepositoryPort;

   public List<ServiceStatus> findServices(String name, String status){

    return serviceStatusRepositoryPort.findServices(name, status);
}

         public ServiceStatusUseCaseImpl(ServiceStatusRepositoryPort serviceStatusRepositoryPort){
              this.serviceStatusRepositoryPort = serviceStatusRepositoryPort;
          }
}
