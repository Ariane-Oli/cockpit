package com.cockpit.cockpitbackend.usecase;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.domain.model.ServiceStatus;
import com.cockpit.cockpitbackend.ports.input.ServiceStatusUseCasePort;
import com.cockpit.cockpitbackend.ports.output.ServiceStatusRepositoryPort;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ServiceStatusUseCaseImpl implements ServiceStatusUseCasePort {

    private final ServiceStatusRepositoryPort serviceStatusRepositoryPort;

    //Construtor para injeção de dependência
    public ServiceStatusUseCaseImpl(ServiceStatusRepositoryPort serviceStatusRepositoryPort) {
        this.serviceStatusRepositoryPort = serviceStatusRepositoryPort;
    }

// Implementação do metodo da interface
@Override
   public List<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest){

    return serviceStatusRepositoryPort.findServices(name, status, paginationRequest);

    }


}
