/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackatonUnilibre.hackaton.Api;

import com.hackatonUnilibre.hackaton.Model.Asesor;
import com.hackatonUnilibre.hackaton.Model.Cliente;
import com.hackatonUnilibre.hackaton.Model.Cotizacion;
import com.hackatonUnilibre.hackaton.Model.Orden;
import com.hackatonUnilibre.hackaton.Model.Paquete;
import com.hackatonUnilibre.hackaton.Model.Producto;
import com.hackatonUnilibre.hackaton.Service.AsesorService;
import com.hackatonUnilibre.hackaton.Service.ClienteService;
import com.hackatonUnilibre.hackaton.Service.CotizacionService;
import com.hackatonUnilibre.hackaton.Service.OrdenService;
import com.hackatonUnilibre.hackaton.Service.PaqueteService;
import com.hackatonUnilibre.hackaton.Service.ProductoService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // para usar el log
@RestController
@RequestMapping("")
public class Rest {

    //inyeccion de dependencias 
    @Autowired
    private AsesorService AsesorService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private OrdenService ordenService;
    @Autowired
    private CotizacionService cotizacionService;
    @Autowired
    private PaqueteService paqueteService;
    @Autowired
    private ProductoService productoService;

    @PostMapping("/saveAsesor")
    private ResponseEntity<Asesor> SaveAsesor(@RequestBody Asesor asesor) {
        Asesor newAsesor = AsesorService.save(asesor);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/user/" + newAsesor.getNombreAsesor())).body(newAsesor);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/saveCliente")
    private ResponseEntity<Cliente> SaveCliente(@RequestBody Cliente cliente) {
        Cliente newcliente = clienteService.save(cliente);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/user/" + newcliente.getNombreCliente())).body(newcliente);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/saveOrden")
    private ResponseEntity<Orden> SaveOrden(@RequestBody Orden orden) {
        Orden newOrden = ordenService.save(orden);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/Orden/" + newOrden.getDescripcionOrden())).body(newOrden);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/saveCotizacion")
    private ResponseEntity<Cotizacion> SaveCotizacion(@RequestBody Cotizacion cotizacion) {
        Cotizacion newcotizacion = cotizacionService.save(cotizacion);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/Orden/" + newcotizacion.getDescripcionCotizacion())).body(newcotizacion);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/savePaquete")
    private ResponseEntity<Paquete> SavePaquete(@RequestBody Paquete paquete) {
        Paquete newPaquete = paqueteService.save(paquete);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/Orden/" + newPaquete.getDescripcionPaquete())).body(newPaquete);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/saveProdcuto")
    private ResponseEntity<Producto> SavePaquete(@RequestBody Producto producto) {
        Producto newProducto = productoService.save(producto);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/Orden/" + newProducto.getNombreProdcuto())).body(newProducto);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    //Encontrar Productos by ID
    @GetMapping("find/{id}")
    private ResponseEntity<Producto> getProductoById(@PathVariable(name = "id") long id) {

        Optional<Producto> producto = productoService.findById(id);

        if (producto.isPresent()) {
            Producto c = producto.get();

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }

    }

    //Encontrar Productos 
    @GetMapping("/find")
    private ResponseEntity<Iterable<Producto>> getProductos() {

        return ResponseEntity.ok(productoService.findAll());
    }

}
