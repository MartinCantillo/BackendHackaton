/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class Orden {

    @Id
    //autoIncrementable
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoOrden;
    private String descripcionOrden;
    private int estadoOrden;
    private int fechaOrden;
    private double precioPaquete;
    //Relacion 1 a 1 con productos
    @OneToOne
    private Producto producto;
}
