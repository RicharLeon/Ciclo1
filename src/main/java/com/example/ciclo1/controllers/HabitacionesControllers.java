package com.example.proyecto1.controllers;

import com.example.proyecto1.models.dao.IHabitacionesService;
import com.example.proyecto1.models.dao.HabitacionesConsultaDTO;
import com.example.proyecto1.models.dao.Habitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/habitaciones")

public class HabitacionesControllers {
    Map<String, Object> response = new HashMap<>();

    @Autowired
    private IHabitacionesService habitacionesService;

    @GetMapping("/{id}")
    public ResponseEntity<?>mostrarHabitacionesPorIdDepartamento(@PathVariable Long id) {
        return new ResponseEntity<>(habitacionesService.mostrarHabitacionesPorIdDepartamento(id), HttpStatus.OK);
    }
}
