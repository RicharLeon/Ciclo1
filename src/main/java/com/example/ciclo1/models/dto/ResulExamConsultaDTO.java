package com.example.ciclo1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResulExamConsultaDTO {

    public Long resultadoExamenID;
    public LocalDate fecha;
    public String nombrePaciente;
    public String apellidoPaciente;
    public String tipoExamen;
    public String resultado;

}
