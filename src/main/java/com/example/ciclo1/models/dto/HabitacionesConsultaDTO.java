package com.example.proyecto1.models.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class HabitacionesConsultaDTO {

    public Long idHabitacion;
    public Long nroHabitacion;
    public String tipoHabitacion;
    public Long habitacionDisponible;
    private Long idDepartamento;

}
