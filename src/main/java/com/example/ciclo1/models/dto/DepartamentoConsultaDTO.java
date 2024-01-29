package com.example.ciclo1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DepartamentoConsultaDTO {

    private Long idDepartamento;
    public String nombreDepartamento;
    public String descripcionDep;

}
