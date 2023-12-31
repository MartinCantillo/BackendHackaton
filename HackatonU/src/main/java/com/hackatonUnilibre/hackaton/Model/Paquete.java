/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Model;

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
public class Paquete {

    @Id
    //autoIncrementable
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoPaquete;
    private String descripcionPaquete;
    private int paqueteDisponible;
    private int cantidadPAquete;
    private double precioPaquete;
    //Relacion 1 a N con productos
    @ManyToOne
     @JoinColumn(name = "productoFK")
    private Producto producto;
    
}
