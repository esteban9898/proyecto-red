package com.example.proyectored.repositories;

import com.example.proyectored.models.PerfilMod;
import com.example.proyectored.models.TipotransporteMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<PerfilMod, Long> {
}
