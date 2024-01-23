package com.example.proyecto_ejemplo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "evento_destacado")
public class EventoDestacado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "centro_id")
    private int centroId;
    @Column(name = "mes_id")
    private int mesId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_inicio")
    private String fecha_inicio;
    @Column(name = "fecha_termino")
    private String fecha_termino;
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "image")
    private String image;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Column(name = "link")
    private String link;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "horario")
    private String horario;

    @Column(name = "color")
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCentroId() {
        return centroId;
    }

    public void setCentroId(int centro_id) {
        this.centroId = centro_id;
    }

    public int getMesId() {
        return mesId;
    }

    public void setMesId(int mes_id) {
        this.mesId = mes_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fecha_inicio;
    }

    public void setFechaInicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFechaTermino() {
        return fecha_termino;
    }

    public void setFechaTermino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
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
