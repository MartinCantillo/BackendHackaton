/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Service;

import com.hackatonUnilibre.hackaton.Model.Paquete;
import com.hackatonUnilibre.hackaton.Repository.PaqueteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author marti
 */
public class PaqueteService implements PaqueteRepository {

    //inyeccion de dependecia
    @Autowired
    private PaqueteRepository paqueteRepository;

    @Override
    public <S extends Paquete> S save(S entity) {
        return paqueteRepository.save(entity);
    }

    @Override
    public <S extends Paquete> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Paquete> findById(Long id) {
        return paqueteRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterable<Paquete> findAll() {
        return paqueteRepository.findAll();
    }

    @Override
    public Iterable<Paquete> findAllById(Iterable<Long> ids) {
        return paqueteRepository.findAllById(ids);
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Long id) {
        paqueteRepository.deleteById(id);
    }

    @Override
    public void delete(Paquete entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        paqueteRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Paquete> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
