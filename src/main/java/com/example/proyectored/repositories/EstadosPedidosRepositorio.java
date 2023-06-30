package com.example.proyectored.repositories;

import com.example.proyectored.models.EstadosPedidoMod;
import com.example.proyectored.models.PerfilMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadosPedidosRepositorio extends JpaRepository<EstadosPedidoMod, Long> {
}
