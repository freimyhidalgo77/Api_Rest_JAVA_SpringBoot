package com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlanetRequestDto {

    @NotBlank(message = "El nombre del planeta es obligatorio")
    @Size(min = 4, max = 100, message = "El nombre del planeta debe tener entre 4 y 100 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo de planeta es obligatorio")
    @Size(min = 4, max = 100, message = "El tipo de planeta debe tener entre 4 y 100 caracteres")
    private String tipo;

    @NotNull(message = "La masa del planeta es obligatoria")
    /*@DecimalMin(value = "0.0", message = "El mínimo es 0")
    @DecimalMax(value = "1000000.0", message = "El peso máximo es 1,000,000")*/
    private Double masa;

    @NotNull(message = "La masa del planeta es obligatoria")
    /*@Min(value = 50, message = "El mínimo es 50")
    @Max(value = 2000000, message = "El radio maximo es 2,000,000")*/
    private int radio;

    @NotNull(message = "La gravedad del planeta es obligatoria")
    private Double gravedad;

    @NotNull(message = "La distancia al sol es obligatoria")
    private Double distancia_al_sol;

    @NotNull(message = "La distancia al sol es obligatoria")
    private int periodo_orbital;

    @NotNull(message = "La distancia al sol es obligatoria")
    private int numero_de_lunas;



}




