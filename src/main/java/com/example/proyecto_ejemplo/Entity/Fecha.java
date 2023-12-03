package com.example.proyecto_ejemplo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "fecha")
public class Fecha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "centro_id")
    private int centro_id;
    @Column(name = "evento_id")
    private int evento_id;
    @Column(name = "fecha_inicio")
    private String fecha_inicio;
    @Column(name = "fecha_termino")
    private String fecha_termino;

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

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }
}
