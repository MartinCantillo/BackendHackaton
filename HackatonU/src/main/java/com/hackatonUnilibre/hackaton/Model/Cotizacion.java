/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Model;

import com.hackatonUnilibre.hackaton.Model.Cliente;
import com.hackatonUnilibre.hackaton.Model.Asesor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marti
 */
//Get and sett furthermore Constructors
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cotizacion {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCotizacion;
    private String descripcionCotizacion;
    private String fechaCotizacion;
    private double subTotal;
    private double descuento;
    private double montoTotal;
    
    @ManyToOne
    @JoinColumn(name = "clienteFK")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "asesorFK")
    private Asesor asesor;
}
