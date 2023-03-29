package com.example.proyecto_ejemplo.Service.PersonaServiceIMPL;

import com.example.proyecto_ejemplo.Entity.Persona;
import com.example.proyecto_ejemplo.Repository.PersonaRepo;
import com.example.proyecto_ejemplo.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PSIMPL implements PersonaService{
    @Autowired
    private PersonaRepo repo;
    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
