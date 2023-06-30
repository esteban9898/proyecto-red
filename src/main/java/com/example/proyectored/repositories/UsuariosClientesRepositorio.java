package com.example.proyectored.repositories;

import com.example.proyectored.models.UsuarioMod;
import com.example.proyectored.models.UsuariosClientelMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosClientesRepositorio extends JpaRepository<UsuariosClientelMod, Long> {
}
