package com.fraudkeeper.ejercicioLT.entity;

import javax.persistence.*;

@Entity
@Table(name="datos_de_personas")
public class DatosDePersonas {

    @Id
    @Column(name="id", unique = true, nullable = false)
    private int ID;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="telefono")
    private int telefono;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direcciones_id")
    private Direcciones direcciones;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Direcciones getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direcciones direcciones) {
        this.direcciones = direcciones;
    }
}
