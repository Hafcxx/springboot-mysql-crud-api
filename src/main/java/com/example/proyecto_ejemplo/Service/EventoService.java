package com.example.proyecto_ejemplo.Service;

import com.example.proyecto_ejemplo.Entity.Persona;

import java.util.List;

public interface EventoService {
    public List<Persona> consultarEvento();
    public Persona crearEvento(Persona persona);
    public Persona modificarEvento(Persona persona);
    public void eliminarEvento(int id);
}
