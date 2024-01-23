package com.example.ciclo1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PagosConsultaDTO {

    public Long idPago;
    public LocalDate fechaPago;
    public Integer montoPagado;
    public Long idFactura;
    public LocalDate fechaFactura;
    public Integer montoFactura;
    public boolean estadoPagado;
    public Long idPaciente;
    public String nombrePaciente;
    public String apellidoPaciente;


}
