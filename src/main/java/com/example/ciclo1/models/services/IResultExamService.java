package com.example.ciclo1.models.services;

import com.example.ciclo1.models.dto.ResulExamConsultaDTO;
import com.example.ciclo1.models.dto.ResulExamPersistenciaDTO;

import java.util.List;

public interface IResultExamService {

    List<ResulExamPersistenciaDTO> mostrarResultadosExamenes();


    List<ResulExamConsultaDTO> mostrarResultadoExamenesPaciente(String tipoExamen, String genero);

}
