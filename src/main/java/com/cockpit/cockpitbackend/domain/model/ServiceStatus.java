package com.cockpit.cockpitbackend.domain.model;


import com.cockpit.cockpitbackend.adapters.output.persistence.entity.ServiceStatusEntity;

public class ServiceStatus {

    private Integer id;
    private String name;
    private String status;

    public Integer getId(){

        return id;
    }

    public String getName() {

        return name;
    }

    public String getStatus() {

        return status;
    }

    public ServiceStatus(Integer id, String name, String status){
        this.id = id;
        this.name = name;
        this.status = status;

    }

}
