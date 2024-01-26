package com.example.ciclo1.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RESULTADOS_EXAMENES")
public class ResultadoExamenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESULTADOEXAMEN_ID")
    private Long resultadoExamenID;
    @Column(name = "FECHA")
    private LocalDate fecha;
    @Column(name = "PACIENTE_ID")
    private Long pacienteID;
    @Column(name = "TIPOEXAMEN")
    private String tipoExamen;
    @Column(name = "RESULTADO")
    private String resultado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PACIENTE_ID", insertable = false, updatable = false)
    private Pacientes pacientes;
}
