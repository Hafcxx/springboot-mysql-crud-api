package com.example.proyecto_ejemplo.Controller;

import com.example.proyecto_ejemplo.Entity.Persona;
import com.example.proyecto_ejemplo.Service.PersonaServiceIMPL.PSIMPL;
import com.example.proyecto_ejemplo.Entity.Evento;
import com.example.proyecto_ejemplo.Service.EventoServiceIMPL.ESIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class Controlador {
    @Autowired
    private PSIMPL impl;
    @Autowired
    private ESIMPL eimpl;


    @GetMapping
    @RequestMapping(value = "evento",method = RequestMethod.GET)
    public ResponseEntity<?> consultarEvento(@RequestParam(name = "centroId") int centroId, @RequestParam(name = "mesId") int mesId){
        List<Evento> listaEvento = this.eimpl.consultarEvento(centroId, mesId);
        return ResponseEntity.ok(listaEvento);
    }
    @GetMapping
    @RequestMapping(value = "persona",method = RequestMethod.GET)
    public ResponseEntity<?> consultarPersona(){
        List<Persona> listaPersona = this.impl.consultarPersona();
        return ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value = "persona",method = RequestMethod.POST)
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona){
       Persona personaCreada = this.impl.crearPersona(persona);
       return ResponseEntity.status(HttpStatus.CREATED).body(personaCreada);
    }

    @PutMapping
    @RequestMapping(value = "persona",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPersona(@RequestBody Persona persona){
        Persona personaModificada = this.impl.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }

    @GetMapping
    @RequestMapping(value = "persona/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarPersona(@PathVariable int id){
        Persona persona = this.impl.buscarPersona(id);
        return ResponseEntity.ok(persona);
    }


    @DeleteMapping
    @RequestMapping(value = "persona/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPersona(@PathVariable int id){
        this.impl.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }




}
