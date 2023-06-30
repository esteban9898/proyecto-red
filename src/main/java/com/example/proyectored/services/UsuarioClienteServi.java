package com.example.proyectored.services;

import com.example.proyectored.models.UsuarioMod;
import com.example.proyectored.models.UsuariosClientelMod;
import com.example.proyectored.repositories.UsuarioRepositorio;
import com.example.proyectored.repositories.UsuariosClientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioClienteServi {
    @Autowired
    UsuariosClientesRepositorio UsuarioRepo;

    public ArrayList<UsuariosClientelMod> getUsuario(){
        return (ArrayList<UsuariosClientelMod>) UsuarioRepo.findAll();

    }

    public  UsuariosClientelMod saveUSuario(UsuariosClientelMod usuario){
        return UsuarioRepo.save(usuario);

    }

    public Optional<UsuariosClientelMod> getId(Long id){
        return UsuarioRepo.findById(id);


    }

    public UsuariosClientelMod updateUsuarioContr(UsuariosClientelMod request, Long id){
        UsuariosClientelMod   user = UsuarioRepo.findById(id).get();
        user.setId_cliente(request.getId_cliente());
        return user;

    }
   public Boolean DeleteUSuario(Long id){
        try{
            UsuarioRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
   }


}
