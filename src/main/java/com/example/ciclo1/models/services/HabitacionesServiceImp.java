package com.example.proyecto1.models.dao;

import com.example.ciclo1.models.dao.IHabitacionesDao;
import com.example.proyecto1.models.dao.IHabitacionesService;
import com.example.proyecto1.models.dao.Habitaciones;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor

public class HabitacionesServiceImp implements IHabitacionesService {

    private final IHabitacionesDao habitacioneService;

    @Override
    public List<Habitaciones> findAll() { return habitacioneService.findAll();}
}
