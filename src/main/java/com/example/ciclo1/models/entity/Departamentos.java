package com.example.ciclo1.models.entity;

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
@Table(name = "departamentos")

public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "DEPARTAMENTO_ID", insertable = false, updatable = false)
    private Long idDepartamento;

    @Column(name = "NOMBRE")
    public String nombreDepartamento;

    @Column(name = "DESCRIPCION")
    public String descripcionDep;

}
