package com.bonpland.bonpland.entities;

import jakarta.persistence.*;

/**
 * Dirección de los inmuebles.
 * A cada inmueble le corresponderá una dirección y una dirección pertenecerá a un solo inmueble.
 */
@Entity
@Table(name = "bp_direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String calle;
    private String numero;
    private String localidad;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion() {
    }

    public Direccion(Long id, String calle, String numero, String localidad, String ciudad, String estado, String pais) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
