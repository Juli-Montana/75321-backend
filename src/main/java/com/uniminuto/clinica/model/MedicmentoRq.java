package com.uniminuto.clinica.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class MedicmentoRq {

    private Long id;
    private String nombre;
    private String descripcion;
    private String presentacion;
    private LocalDate fechaCompra;
    private LocalDate fechaVence;
    private LocalDateTime fechaCreacionRegistro;
    private LocalDateTime fechaModificacionRegistro;

}
