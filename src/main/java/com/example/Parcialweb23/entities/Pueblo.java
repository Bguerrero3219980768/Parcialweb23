package com.example.Parcialweb23.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pueblo {
    @Id
    private Integer serial;
    private String descripcion;
    private Integer uuid;
}
