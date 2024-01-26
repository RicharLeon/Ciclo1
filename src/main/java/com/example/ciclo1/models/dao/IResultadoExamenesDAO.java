package com.example.ciclo1.models.dao;

import com.example.ciclo1.models.dto.ResulExamPersistenciaDTO;
import com.example.ciclo1.models.dto.ResulExamConsultaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IResultadoExamenesDAO extends JpaRepository {

    @Query("select new com.example.ciclo1.models.dto.ResulExamPersistenciaDTO(re.resultadoExamenID, re.fecha, p.idPaciente, re.tipoExamen, re.resultado) from ResultadoExamenes re " +
            "inner join re.pacientes p" )

    List<ResulExamPersistenciaDTO> findResultExam();

    @Query("select new com.example.ciclo1.models.dto.ResulExamConsultaDTO(re.resultadoExamenID, re.fecha, p.name, p.apellido, re.tipoExamen, re.resultado) from ResultadoExamenes re " +
            "inner join re.pacientes p")

    List<ResulExamConsultaDTO> notConditionResult();

    @Query("select new com.example.ciclo1.models.dto.ResulExamConsultaDTO(re.resultadoExamenID, re.fecha, p.name, p.apellido, re.tipoExamen, re.resultado) from ResultadoExamenes re " +
            "inner join re.pacientes p " +
            "where re.resultado = ?1")

    List<ResulExamConsultaDTO> forConditionResult(String resultado);
}
