package com.example.proyectored.controllers;

import com.example.proyectored.models.EstadosPedidoMod;
import com.example.proyectored.models.HistorialPedidoMod;
import com.example.proyectored.services.EstadosPedidoServi;
import com.example.proyectored.services.HistorialPedidoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/Historialped")

public class HistorialPedidoControl {
    @Autowired
    private HistorialPedidoServi historialPedidoServi;

    @GetMapping
    public ArrayList<HistorialPedidoMod> getPedido(){
        return this.historialPedidoServi.getPedido();

    }
    @RequestMapping("/Crear")
    @PostMapping
    public HistorialPedidoMod  savePedido(@RequestBody HistorialPedidoMod Pedido){

        return this.historialPedidoServi.savePedido(Pedido);

    }

    @GetMapping(path = "/{id}")
    public Optional<HistorialPedidoMod> geId(@PathVariable Long id){
        return this.historialPedidoServi.getIdPedido(id);

    }
    @PutMapping(path = "/Modificar/{id}")
    public HistorialPedidoMod updatePedidoContr(@RequestBody HistorialPedidoMod request, @PathVariable Long id){
        return this.historialPedidoServi.updatePedidoContr(request, id);
    }

    @DeleteMapping(path ="/Eliminar/{id}")
    public String  DeletePedido(@PathVariable  Long id){
        boolean ok= this.historialPedidoServi.DeletePedido(id);
        if(ok){
            return "Usuario " + id + "eliminado";
        }else {
            return "Error en la eliminacion";
        }
    }

}
