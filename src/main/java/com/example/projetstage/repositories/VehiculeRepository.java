package com.example.projetstage.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetstage.models.Vehicule;
import org.springframework.stereotype.Repository;


@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{

}
