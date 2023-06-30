package com.example.proyectored.services;

import com.example.proyectored.models.EstadosPedidoMod;
import com.example.proyectored.models.PedidoMod;
import com.example.proyectored.repositories.EstadosPedidosRepositorio;
import com.example.proyectored.repositories.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstadosPedidoServi {
    @Autowired
    EstadosPedidosRepositorio estadosPedidosRepositorio;

    public ArrayList<EstadosPedidoMod> getPedido(){
        return (ArrayList<EstadosPedidoMod>) estadosPedidosRepositorio.findAll();

    }

    public  EstadosPedidoMod savePedido(EstadosPedidoMod estadopedido){
        return estadosPedidosRepositorio.save(estadopedido);

    }

    public Optional<EstadosPedidoMod> getIdPedido(Long id){
        return estadosPedidosRepositorio.findById(id);


    }

    public EstadosPedidoMod updatePedidoContr(EstadosPedidoMod request, Long id){
        EstadosPedidoMod  user = estadosPedidosRepositorio.findById(id).get();
        user.setNombre(request.getNombre());
        return user;

    }
   public Boolean DeletePedido(Long id){
        try{
            estadosPedidosRepositorio.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
   }


}
