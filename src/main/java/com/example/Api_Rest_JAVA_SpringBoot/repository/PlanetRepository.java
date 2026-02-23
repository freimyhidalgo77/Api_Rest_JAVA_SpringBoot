package com.example.Api_Rest_JAVA_SpringBoot.repository;

import com.example.Api_Rest_JAVA_SpringBoot.models.Planet;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet,Integer > {

}
