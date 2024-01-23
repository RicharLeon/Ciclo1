package com.example.ciclo1.models.dto;

import com.example.ciclo1.models.entity.Factura;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagosPersistenciaDTO {

    public Long idPago;
    public Long idFactura;
    public LocalDate date;
    public Integer montoPagado;

}
