package com.example.proyecto1.models.dao;

import com.example.ciclo1.models.entity.Departamentos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "habitaciones")

public class Habitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HABITACION_ID")
    public Long idHabitacion;

    @Column(name = "NUMERO")
    public Long nroHabitacion;

    @Column(name = "TIPO")
    public String tipoHabitacion;

    @Column(name = "DISPONIBLE")
    public Long habitacionDisponible;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTAMENTO_ID", insertable = false, updatable = false)
    private Departamentos idDepartamento;
}
