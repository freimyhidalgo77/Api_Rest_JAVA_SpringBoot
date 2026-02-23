package com.example.Api_Rest_JAVA_SpringBoot.services;


import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetRequestDto;
import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetResponseDto;

import java.util.List;

public interface PlanetService {
    PlanetResponseDto insertPlanet(PlanetRequestDto dto);
    List<PlanetResponseDto> listPlanet();
    PlanetResponseDto getPlanetById(int id);
    PlanetResponseDto updatePlanet(int id, PlanetRequestDto dto);
    void deletePlanet(int id);




}
