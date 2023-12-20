package com.example.Parcialweb23.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @SequenceGenerator(name = "pokemon_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo_pokemon")
    private Integer tipoPokemon;

    @Column(name = "fecha_descubrimiento")
    private Date fechaDescubrimiento;

    @Column(name = "generacion")
    private Integer generacion;

    @Column(name = "uuid")
    private String uuid;

    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    // Constructor, getters, setters y otros métodos pueden ir aquí según sea necesario

}



