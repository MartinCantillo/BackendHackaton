/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Service;

import com.hackatonUnilibre.hackaton.Model.Producto;
import com.hackatonUnilibre.hackaton.Repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author marti
 */
public class ProductoService implements ProductoRepository {

    //inyeccion de dependecia
    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public <S extends Producto> S save(S entity) {
        return productoRepository.save(entity);
    }
    
    @Override
    public <S extends Producto> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }
    
    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Iterable<Producto> findAll() {
        return productoRepository.findAll();
    }
    
    @Override
    public Iterable<Producto> findAllById(Iterable<Long> ids) {
        return productoRepository.findAllById(ids);
    }
    
    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
    
    @Override
    public void delete(Producto entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        productoRepository.deleteAllById(ids);
    }
    
    @Override
    public void deleteAll(Iterable<? extends Producto> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
