package com.example.ciclo1.models.services;

import com.example.ciclo1.mappers.PagosMapper;
import com.example.ciclo1.models.dao.IPagosDao;
import com.example.ciclo1.models.dto.PagosConsultaDTO;
import com.example.ciclo1.models.dto.PagosPersistenciaDTO;
import com.example.ciclo1.models.entity.Pagos;
import com.example.ciclo1.utils.Constantes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class PagosServiceImpl implements IPagosService{

    private final IPagosDao pagosDao;

    @Override
    public List<PagosPersistenciaDTO> mostrarPagos() {
        return pagosDao.findPagos();
    }

    @Override
    public Optional<PagosPersistenciaDTO> mostrarPagosPorID(Long id) {
        return pagosDao.findPagosForId(id);
    }

    @Override
    public Pagos guardarNuevoPago(PagosPersistenciaDTO pagos) {
        Pagos pangoEntity = PagosMapper.INSTANCIA.dtoPersistenciaToEntity(pagos);
        return pagosDao.save(pangoEntity);
    }

    @Override
    public void eliminarPago(Long id) {
        Pagos pagoRecibido = pagosDao.findById(id)
                .orElseThrow(() -> new RuntimeException(MessageFormat
                        .format("No se encontro el id {0}", id)));
        pagosDao.deleteById(id);
    }

    @Override
    public List<PagosConsultaDTO> mostrarPagosQueRealziados(boolean estado, String diagnostico) {
        System.out.println("Valor de diagnostico: " + diagnostico);
        //diagnostico = diagnostico.trim(); // ELIMINAR ESPACIOS AL FINAL y AL INICIO
        if (Constantes.DIAGNOSTICOFINAL.equals(diagnostico)){
            return pagosDao.forCondition(estado);
        }else{
            return pagosDao.notCondition();
        }
    }
}
