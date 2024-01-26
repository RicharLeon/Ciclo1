package com.example.ciclo1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResulExamPersistenciaDTO {

    public Long resultadoExamenID;
    public LocalDate fecha;
    public Long pacienteID;
    public String tipoExamen;
    public String resultado;

}
