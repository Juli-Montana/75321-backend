package com.uniminuto.clinica.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table (name = "medicamento")
public class Medicamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String presentacion;

    @Column(name = "fecha_compra")
    private Date fechaCompra;

    @Column(name = "fecha_vence")
    private Date fechaVence;

    @Column(name = "fecha_creacion_registro")
    private Date fechaCreacionRegistro;

    @Column(name = "fecha_modificacion_registro")
    private Date fechaModificacionRegistro;

}
