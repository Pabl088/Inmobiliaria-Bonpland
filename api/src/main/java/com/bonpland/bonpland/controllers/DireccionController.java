package com.bonpland.bonpland.controllers;

import com.bonpland.bonpland.entities.Direccion;
import com.bonpland.bonpland.services.DireccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/direcciones")
public class DireccionController {

    private final DireccionService direccionService;

    public DireccionController(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    @GetMapping
    public ResponseEntity<List<Direccion>> findAll(){ return direccionService.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> findById(@PathVariable Long id){return direccionService.findById(id);}

    @PostMapping
    public ResponseEntity<Direccion> save(@RequestBody Direccion direccion){return direccionService.save(direccion);}

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id){return direccionService.delete(id);}

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteAll(){return direccionService.deleteAll();}

    @PutMapping
    public ResponseEntity<Direccion> update(@RequestBody Direccion direccion){return direccionService.update(direccion);}
}
