package com.example.proyectored.services;

import com.example.proyectored.models.PerfilMod;
import com.example.proyectored.models.UsuarioMod;
import com.example.proyectored.repositories.PerfilRepositorio;
import com.example.proyectored.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PerfilServi {
    @Autowired
    PerfilRepositorio PerfilRepo;

    public ArrayList<PerfilMod> getPerfil(){
        return (ArrayList<PerfilMod>) PerfilRepo.findAll();

    }

    public  PerfilMod savePerfil(PerfilMod perfil){
        return PerfilRepo.save(perfil);

    }

    public Optional<PerfilMod> getIdPerfil(Long id){
        return PerfilRepo.findById(id);


    }

    public PerfilMod updatePerfilContr(PerfilMod request, Long id){
        PerfilMod   user = PerfilRepo.findById(id).get();
        user.setNombre(request.getNombre());
        return user;

    }
   public Boolean DeletePerfil(Long id){
        try{
            PerfilRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
   }


}
