/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Service;

import com.hackatonUnilibre.hackaton.Model.Asesor;
import com.hackatonUnilibre.hackaton.Repository.AsesorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author marti
 */
public class AsesorService implements AsesorRepository {
    //inyeccion de dependencias 

    @Autowired
    private AsesorRepository AsesorRepository;

    @Override
    public <S extends Asesor> S save(S entity) {
        return AsesorRepository.save(entity);
    }

    @Override
    public <S extends Asesor> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Asesor> findById(Long id) {
        return AsesorRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return AsesorRepository.existsById(id);
    }

    @Override
    public Iterable<Asesor> findAll() {
        return AsesorRepository.findAll();
    }

    @Override
    public Iterable<Asesor> findAllById(Iterable<Long> ids) {
        return AsesorRepository.findAllById(ids);
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Long id) {
        AsesorRepository.deleteById(id);
    }

    @Override
    public void delete(Asesor entity) {
AsesorRepository.delete(entity);    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
AsesorRepository.deleteAllById(ids);    }

    @Override
    public void deleteAll(Iterable<? extends Asesor> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
