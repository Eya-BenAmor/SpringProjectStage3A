package com.example.projetstage.services;

import com.example.projetstage.models.Vehicule;
import com.example.projetstage.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehiculeServiceImp implements VehiculeService {
    @Autowired
    VehiculeRepository VehiculeRepository;
    @Override
    public List<Vehicule> findAll() {
        return VehiculeRepository.findAll();
    }

    @Override
    public Vehicule save(Vehicule vehicule) {
        VehiculeRepository.save(vehicule);
        return vehicule;
    }

    @Override
    public Vehicule findById(Integer id) {
        if(VehiculeRepository.findById(id).isPresent()){
            return VehiculeRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        Vehicule vehicule = findById(id);
        VehiculeRepository.delete(vehicule);
    }
}
