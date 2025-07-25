package com.cockpit.cockpitbackend.usecase;

import com.cockpit.cockpitbackend.adapters.input.dto.PaginationRequest;
import com.cockpit.cockpitbackend.adapters.output.dto.PaginatedResponse;
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
   public PaginatedResponse<ServiceStatus> findServices(String name, String status, PaginationRequest paginationRequest){
   PaginatedResponse<ServiceStatus> allFilteredServices = serviceStatusRepositoryPort.findServices(name, status,paginationRequest);

   int page = paginationRequest.getPage();
   int size = paginationRequest.getSize();
   long totalElements = allFilteredServices.getContent().size();
   int totalPages = (int) Math.ceil((double) totalElements / size);

   int offset = page * size;
   List<ServiceStatus> paginatedList = allFilteredServices.getContent()
           .stream()
           .skip(offset)
           .limit(size)
           .toList();

   return PaginatedResponse.<ServiceStatus>builder()
            .content(paginatedList)
            .size(size)
            .totalElements(totalElements)
           .page(page)
            .totalPages(totalPages)
            .build();


    }


}
