/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Repository;

import com.hackatonUnilibre.hackaton.Model.Asesor;
import com.hackatonUnilibre.hackaton.Model.Cotizacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author marti
 */
public interface CotizacionRepository  extends CrudRepository<Cotizacion, Long>{
    
}
