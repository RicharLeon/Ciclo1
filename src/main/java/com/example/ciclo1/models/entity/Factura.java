package com.example.ciclo1.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.*;
import java.sql.SQLOutput;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "FACTURAS")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FACTURA_ID")
    public Long idFactura;
    @Column(name = "FECHA")
    public LocalDate fecha;
    @Column(name = "PACIENTE_ID")
    public Long idPaciente;
    @Column(name = "MONTO")
    public Integer monto;
    @Column(name = "PAGADA")
    public boolean pagada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PACIENTE_ID", insertable = false, updatable = false)
    private Pacientes pacientes;

}
