package com.example.Api_Rest_JAVA_SpringBoot.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombre;
    private String Rocoso;
    private double masa;
    private int radio;
    private double gravedad;
    private double distancia_al_sol;
    private int periodo_orbital;
    private int numero_de_lunas;
    private boolean tiene_anillos = false;


}

