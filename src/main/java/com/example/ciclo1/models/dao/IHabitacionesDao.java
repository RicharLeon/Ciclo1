package com.example.ciclo1.models.dao;

import com.example.proyecto1.models.dao.HabitacionesConsultaDTO;
import com.example.proyecto1.models.dao.Habitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHabitacionesDao extends JpaRepository<Habitaciones, Long> {

    @Query("SELECT NEW com.example.proyecto1.models.dao.HabitacionesConsultaDTO( h.idHabitacion, h.nroHabitacion, h.tipoHabitacion, " +
            "h.habitacionDisponible) FROM habitaciones h INNER JOIN departamentos d " +
            "WHERE h.habitacionDisponible = '1' AND h.habitacionDisponible = ?1 ")

    List<HabitacionesConsultaDTO> consultaHabitacionesPorDepartamento(Long id);
}
