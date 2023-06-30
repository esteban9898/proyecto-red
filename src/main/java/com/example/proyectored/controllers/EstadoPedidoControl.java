package com.example.proyectored.controllers;

import com.example.proyectored.models.EstadosPedidoMod;
import com.example.proyectored.models.PedidoMod;
import com.example.proyectored.services.EstadosPedidoServi;
import com.example.proyectored.services.PedidoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/Estadoped")

public class EstadoPedidoControl {
    @Autowired
    private EstadosPedidoServi estadosPedidoServi;

    @GetMapping
    public ArrayList<EstadosPedidoMod> getPedido(){
        return this.estadosPedidoServi.getPedido();

    }
    @RequestMapping("/Crear")
    @PostMapping
    public EstadosPedidoMod  savePedido(@RequestBody EstadosPedidoMod Pedido){

        return this.estadosPedidoServi.savePedido(Pedido);

    }

    @GetMapping(path = "/{id}")
    public Optional<EstadosPedidoMod> geId(@PathVariable Long id){
        return this.estadosPedidoServi.getIdPedido(id);

    }
    @PutMapping(path = "/Modificar/{id}")
    public EstadosPedidoMod updatePedidoContr(@RequestBody EstadosPedidoMod request, @PathVariable Long id){
        return this.estadosPedidoServi.updatePedidoContr(request, id);
    }

    @DeleteMapping(path ="/Eliminar/{id}")
    public String  DeletePedido(@PathVariable  Long id){
        boolean ok= this.estadosPedidoServi.DeletePedido(id);
        if(ok){
            return "Usuario " + id + "eliminado";
        }else {
            return "Error en la eliminacion";
        }
    }

}
