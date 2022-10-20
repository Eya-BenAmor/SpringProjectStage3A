package com.example.projetstage.controllers;

import com.example.projetstage.models.Vehicule;
import com.example.projetstage.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.projetstage.services.VehiculeService;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.projetstage.models.Vehicule;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")

public class VehiculeController {

    @Autowired
    VehiculeService VehiculeService;

    @GetMapping("/vehicules")
    public ResponseEntity<List<Vehicule>> get() {
        List<Vehicule> expenses = VehiculeService.findAll();
        return new ResponseEntity<List<Vehicule>>(expenses, HttpStatus.OK);
    }

    @PostMapping("/vehicules")
    public ResponseEntity<Vehicule> save(@RequestBody Vehicule expense) {
        Vehicule expenseOne = VehiculeService.save(expense);
        return new ResponseEntity<Vehicule>(expenseOne, HttpStatus.OK);
    }

    @GetMapping("/vehicules/{id}")
    public ResponseEntity<Vehicule> get(@PathVariable("id") Integer id) {
        Vehicule expense = VehiculeService.findById(id);
        return new ResponseEntity<Vehicule>(expense, HttpStatus.OK);
    }

    @DeleteMapping("/vehicules/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        VehiculeService.delete(id);
        return new ResponseEntity<String>("Expense is deleted successfully.!", HttpStatus.OK);
    }
}
