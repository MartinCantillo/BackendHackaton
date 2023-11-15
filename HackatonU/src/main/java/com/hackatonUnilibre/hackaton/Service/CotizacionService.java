/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Service;

import com.hackatonUnilibre.hackaton.Model.Cotizacion;
import com.hackatonUnilibre.hackaton.Repository.CotizacionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author marti
 */
public class CotizacionService implements CotizacionRepository {
    //inyeccion de dependecia

    @Autowired
    private CotizacionRepository cotizacionRepository;

    @Override
    public <S extends Cotizacion> S save(S entity) {
        return cotizacionRepository.save(entity);
    }

    @Override
    public <S extends Cotizacion> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Cotizacion> findById(Long id) {
        return cotizacionRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterable<Cotizacion> findAll() {
        return cotizacionRepository.findAll();
    }

    @Override
    public Iterable<Cotizacion> findAllById(Iterable<Long> ids) {
        return cotizacionRepository.findAllById(ids);
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Long id) {
cotizacionRepository.deleteById(id);    }

    @Override
    public void delete(Cotizacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
cotizacionRepository.deleteAllById(ids);    }

    @Override
    public void deleteAll(Iterable<? extends Cotizacion> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
