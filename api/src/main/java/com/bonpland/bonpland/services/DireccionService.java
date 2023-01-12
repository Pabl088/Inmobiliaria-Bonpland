package com.bonpland.bonpland.services;

import com.bonpland.bonpland.entities.Direccion;
import com.bonpland.bonpland.repositories.DireccionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Clase con todos los metodos utilizados para interactuar con la entidad Direccion.
 */

@Service
public class DireccionService {

    private final DireccionRepository direccionRepository;

    public DireccionService(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    public ResponseEntity<List<Direccion>> findAll(){
        Optional<List<Direccion>> direcciones = Optional.of(direccionRepository.findAll());

        return direcciones.map(direccion -> new ResponseEntity<>(direccion, HttpStatus.OK)).orElse(ResponseEntity.noContent().build());
    }

    public ResponseEntity<Direccion> findById(Long id){
        Optional<Direccion> direccion = direccionRepository.findById(id);

        return direccion.map(direccion1 -> new ResponseEntity<>(direccion1, HttpStatus.OK)).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Direccion> save(Direccion direccion){
        Optional<Direccion> direccion1 = Optional.of(direccionRepository.save(direccion));

        return direccion1.map(direccion2 -> new ResponseEntity<>(direccion2, HttpStatus.OK)).orElse(ResponseEntity.badRequest().build());
    }

    public ResponseEntity<HttpStatus> delete(Long id){
        if(!direccionRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        direccionRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<HttpStatus> deleteAll(){
        direccionRepository.deleteAll();
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Direccion> update(Direccion direccion){
        if(direccion.getId() == null){
            return ResponseEntity.badRequest().build();
        }
        if(!direccionRepository.existsById(direccion.getId())){
            return ResponseEntity.notFound().build();
        }
        return save(direccion);
    }



}
