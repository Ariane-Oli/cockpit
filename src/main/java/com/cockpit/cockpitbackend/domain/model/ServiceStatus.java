package com.cockpit.cockpitbackend.domain.model;

public class ServiceStatus {

    private String name;
    private String status;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public ServiceStatus(String name, String status){
        this.name = name;
        this.status = status;


    }
}
