package com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonPropertyOrder({"id","nombre","tipo", "masa","radio","gravedad","distancia_al_sol", "periodo_orbital", "numero_de_lunas","tiene_anillos"  })
public class PlanetResponseDto {

    private int id;
    private String nombre;
    private String tipo;
    private double masa;
    private int radio;
    private double gravedad;
    private double distancia_al_sol;
    private int periodo_orbital;
    private int numero_de_lunas;
    private boolean tiene_anillos = false;

}
