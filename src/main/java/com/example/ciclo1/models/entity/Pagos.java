package com.example.ciclo1.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAGOS")
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAGO_ID")
    public Long idPago;
    @Column(name = "FACTURA_ID")
    public Long idFactura;
    @Column(name = "FECHA")
    public LocalDate date;
    @Column(name = "MONTO_PAGADO")
    public Integer montoPagado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACTURA_ID", insertable = false, updatable = false)
    private Factura factura;

}
