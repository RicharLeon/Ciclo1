package com.example.proyecto1.controllers;

import com.example.proyecto1.models.dao.IHabitacionesService;
import com.example.proyecto1.models.dao.HabitacionesConsultaDTO;
import com.example.proyecto1.models.dao.Habitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/habitaciones")

public class HabitacionesControllers {

    @Autowired
    private IHabitacionesService habitacionesService;

    @GetMapping("/consulta")
    public List<Habitaciones> getAllHabitaciones() {
        return habitacionesService.findAll();
    }
}
