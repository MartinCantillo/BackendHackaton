/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
//Modelo cliente(Empresa)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCliente;
    private String razonSocial;
    private String nombreCliente;
    private String direccion;
    private String estado;

}
