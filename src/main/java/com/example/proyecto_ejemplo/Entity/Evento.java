package com.example.proyecto_ejemplo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "centro_id")
    private int centro_id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "image")
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCentro_id() {
        return centro_id;
    }

    public void setCentro_id(int centro_id) {
        this.centro_id = centro_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
