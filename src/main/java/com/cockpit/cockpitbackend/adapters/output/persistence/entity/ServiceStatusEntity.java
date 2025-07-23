package com.cockpit.cockpitbackend.adapters.output.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "equipamento_status")
public class ServiceStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "status", nullable = false)
    private String status;
}
