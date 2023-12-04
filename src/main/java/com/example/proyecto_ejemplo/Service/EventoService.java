package com.example.proyecto_ejemplo.Service;

import com.example.proyecto_ejemplo.Entity.Evento;

import java.util.List;

public interface EventoService {

    public List<Evento> consultarEvento(int centroId, int mesId);
    public Evento crearEvento(Evento persona);
    public Evento modificarEvento(Evento persona);
    public void eliminarEvento(int id);
}
