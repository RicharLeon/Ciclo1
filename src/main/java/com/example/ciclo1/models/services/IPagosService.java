package com.example.ciclo1.models.services;

import com.example.ciclo1.models.dto.PagosConsultaDTO;
import com.example.ciclo1.models.dto.PagosPersistenciaDTO;
import com.example.ciclo1.models.entity.Pagos;

import java.util.List;
import java.util.Optional;

public interface IPagosService {

    List<PagosPersistenciaDTO> mostrarPagos();

    Optional<PagosPersistenciaDTO> mostrarPagosPorID(Long id);

    Pagos guardarNuevoPago(PagosPersistenciaDTO pagos);

    void eliminarPago(Long id);

    List<PagosConsultaDTO> mostrarPagosQueRealziados(boolean estado, String diagnostico);

}
