package com.example.ciclo1.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PACIENTES")
public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PACIENTE_ID")
    public Long idPaciente;

    @Column(name = "NOMBRE")
    public String name;
    @Column(name = "APELLIDO")
    public String apellido;
    @Column(name = "FECHA_NACIMIENTO")
    public LocalDate fechaNacimiento;
    @Column(name = "GENERO")
    public String genero;
    @Column(name = "DIRECCION")
    public String direccion;
    @Column(name = "TELEFONO")
    public String telefono;
    @Column(name = "EMAIL")
    public String email;

}
