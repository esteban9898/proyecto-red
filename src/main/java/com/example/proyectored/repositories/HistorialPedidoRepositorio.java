package com.example.proyectored.repositories;

import com.example.proyectored.models.HistorialPedidoMod;
import com.example.proyectored.models.PedidoMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialPedidoRepositorio extends JpaRepository<HistorialPedidoMod, Long> {
}
