package com.cockpit.cockpitbackend.adapters.output.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "equipamento_status")
public class ServiceStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "status", nullable = false)
    private String status;

    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus(){
            return status;
    }
}
