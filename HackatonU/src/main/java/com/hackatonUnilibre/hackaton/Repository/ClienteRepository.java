/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Repository;

import com.hackatonUnilibre.hackaton.Model.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author marti
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
