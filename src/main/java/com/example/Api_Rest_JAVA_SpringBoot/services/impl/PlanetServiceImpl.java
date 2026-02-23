package com.example.Api_Rest_JAVA_SpringBoot.services.impl;


import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetRequestDto;
import com.example.Api_Rest_JAVA_SpringBoot.dto.planetDto.PlanetResponseDto;
import com.example.Api_Rest_JAVA_SpringBoot.exeption.ResourceNotFoundException;
import com.example.Api_Rest_JAVA_SpringBoot.mapper.PlanetMapper;
import com.example.Api_Rest_JAVA_SpringBoot.models.Planet;
import com.example.Api_Rest_JAVA_SpringBoot.repository.PlanetRepository;
import com.example.Api_Rest_JAVA_SpringBoot.services.PlanetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetServiceImpl implements PlanetService {
    private final PlanetRepository planetRepository;

    public PlanetServiceImpl(PlanetRepository planetRepository){this.planetRepository = planetRepository;}

    @Override
    public PlanetResponseDto insertPlanet(PlanetRequestDto dto){
        Planet planet = PlanetMapper.toEntity(dto);
        Planet planetaGuardado = planetRepository.save(planet);
        return PlanetMapper.toDTO((planetaGuardado));

    }

    @Override
    public List<PlanetResponseDto> listPlanet(){
        return planetRepository.findAll()
                .stream()
                .map(PlanetMapper::toDTO)
                .collect(Collectors.toList());


    }

    @Override
    public PlanetResponseDto getPlanetById(int id){
        Planet planet = planetRepository.findById(id)
                .orElseThrow(() ->
                   new ResourceNotFoundException("Planeta no encontrado con el id:" + id)
                );

        return PlanetMapper.toDTO(planet);
    }

    @Override
    public PlanetResponseDto updatePlanet(int id, PlanetRequestDto dto){
        Planet planet = planetRepository.findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Planeta no encontrado con el id:" + id)

                );

        planet.setNombre(dto.getNombre());
        planet.setTipo(dto.getTipo());
        planet.setMasa(dto.getMasa());
        planet.setRadio(dto.getRadio());
        planet.setGravedad(dto.getGravedad());
        planet.setDistancia_al_sol(dto.getDistancia_al_sol());
        planet.setPeriodo_orbital(dto.getPeriodo_orbital());
        planet.setNumero_de_lunas(dto.getNumero_de_lunas());

        Planet updatePlanet = planetRepository.save(planet);
        return PlanetMapper.toDTO(updatePlanet);

    }

    @Override
    public void deletePlanet(int id){
        if(!planetRepository.existsById(id)){
            throw new ResourceNotFoundException("Planeta no encontrado con id:" + id);
        }

        planetRepository.deleteById(id);

    }

}
