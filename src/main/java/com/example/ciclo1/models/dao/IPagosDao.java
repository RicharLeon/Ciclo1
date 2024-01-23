package com.example.ciclo1.models.dao;

import com.example.ciclo1.models.dto.PagosConsultaDTO;
import com.example.ciclo1.models.dto.PagosPersistenciaDTO;
import com.example.ciclo1.models.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IPagosDao extends JpaRepository<Pagos, Long> {

    @Query("select new com.example.ciclo1.models.dto.PagosPersistenciaDTO(p.idPago, f.idFactura, p.date, p.montoPagado) from Pagos p " +
            "inner join p.factura f "
    )
    List<PagosPersistenciaDTO> findPagos();

    @Query("select new com.example.ciclo1.models.dto.PagosPersistenciaDTO(p.idPago, f.idFactura, p.date, p.montoPagado) from Pagos p " +
            "inner join p.factura f " +
            "where p.idPago = ?1"
    )
    Optional<PagosPersistenciaDTO> findPagosForId(Long id);

    @Query("select new com.example.ciclo1.models.dto.PagosConsultaDTO(p.idPago, p.date, p.montoPagado, f.idFactura, f.fecha, f.monto, f.pagada, pa.idPaciente, pa.name, pa.apellido) from Pagos p " +
            "inner join p.factura f " +
            "inner join f.pacientes pa " +
            "where f.pagada = ?1"
    )
    List<PagosConsultaDTO> forCondition(boolean estadoPagado);

    @Query("select new com.example.ciclo1.models.dto.PagosConsultaDTO(p.idPago, p.date, p.montoPagado, f.idFactura, f.fecha, f.monto, f.pagada, pa.idPaciente, pa.name, pa.apellido) from Pagos p " +
            "inner join p.factura f " +
            "inner join f.pacientes pa "
    )
    List<PagosConsultaDTO> notCondition();
}
