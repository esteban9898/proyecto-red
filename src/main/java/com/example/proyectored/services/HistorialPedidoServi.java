package com.example.proyectored.services;

import com.example.proyectored.models.HistorialPedidoMod;
import com.example.proyectored.models.PedidoMod;
import com.example.proyectored.repositories.HistorialPedidoRepositorio;
import com.example.proyectored.repositories.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HistorialPedidoServi {
    @Autowired
    HistorialPedidoRepositorio historialPedidoRepositorio;

    public ArrayList<HistorialPedidoMod> getPedido(){
        return (ArrayList<HistorialPedidoMod>) historialPedidoRepositorio.findAll();

    }

    public  HistorialPedidoMod savePedido(HistorialPedidoMod pedido){
        return historialPedidoRepositorio.save(pedido);

    }

    public Optional<HistorialPedidoMod> getIdPedido(Long id){
        return historialPedidoRepositorio.findById(id);


    }

    public HistorialPedidoMod updatePedidoContr(HistorialPedidoMod request, Long id){
        HistorialPedidoMod   user = historialPedidoRepositorio.findById(id).get();
        user.setUrl_foto(request.getUrl_foto());
        return user;

    }
   public Boolean DeletePedido(Long id){
        try{
            historialPedidoRepositorio.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
   }


}
