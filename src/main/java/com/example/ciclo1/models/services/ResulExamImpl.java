package com.example.ciclo1.models.services;

import com.example.ciclo1.models.dao.IResultadoExamenesDAO;
import com.example.ciclo1.models.dto.PagosConsultaDTO;
import com.example.ciclo1.models.dto.ResulExamConsultaDTO;
import com.example.ciclo1.models.dto.ResulExamPersistenciaDTO;
import com.example.ciclo1.utils.Constantes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;
import java.util.List;


@RequiredArgsConstructor
@Service
@Transactional
public class ResulExamImpl {

    private final IResultadoExamenesDAO resultadoExamenesDAO;
        public List<ResulExamPersistenciaDTO> mostrarResultadoExamenes(){
        return resultadoExamenesDAO.findResultExam();
    }

    public List<ResulExamConsultaDTO> mostrarResultadoExamenesPaciente(String tipoExamen, String resultado) {
        if (Constantes.RESULTADO.equals(resultado)){
            return resultadoExamenesDAO.forConditionResult(resultado);
        }else{
            return resultadoExamenesDAO.notConditionResult();
        }
    }
}
