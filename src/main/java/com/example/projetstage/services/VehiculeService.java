package com.example.projetstage.services;

import com.example.projetstage.models.Vehicule;

import java.util.List;
public interface VehiculeService {
    List<Vehicule> findAll();

    Vehicule save(Vehicule v);

    Vehicule findById(Integer id);

    void delete(Integer id);
}
