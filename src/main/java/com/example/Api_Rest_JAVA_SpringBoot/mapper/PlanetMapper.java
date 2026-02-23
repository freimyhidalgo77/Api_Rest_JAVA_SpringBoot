package com.example.Api_Rest_JAVA_SpringBoot.mapper;

import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetRequestDto;
import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetResponseDto;
import com.example.Api_Rest_JAVA_SpringBoot.models.Planet;

public class PlanetMapper {
    public static Planet toEntity(PlanetRequestDto dto){
        Planet planet = new Planet();
        planet.setNombre(dto.getNombre());
        planet.setTipo(dto.getTipo());
        planet.setMasa(dto.getMasa());
        planet.setRadio(dto.getRadio());
        planet.setGravedad(dto.getGravedad());
        planet.setDistancia_al_sol(dto.getDistancia_al_sol());
        planet.setPeriodo_orbital(dto.getPeriodo_orbital());
        planet.setNumero_de_lunas(dto.getNumero_de_lunas());

        return planet;

    }

    public static PlanetResponseDto toDTO(Planet planet){

        PlanetResponseDto dto = new PlanetResponseDto();
        dto.setId(planet.getId());
        dto.setNombre(planet.getNombre());
        dto.setTipo(planet.getTipo());
        dto.setMasa(planet.getMasa());
        dto.setRadio(planet.getRadio());
        dto.setGravedad(planet.getGravedad());
        dto.setDistancia_al_sol(planet.getDistancia_al_sol());
        dto.setPeriodo_orbital(planet.getPeriodo_orbital());
        dto.setNumero_de_lunas(planet.getNumero_de_lunas());

        return dto;

    }

}
