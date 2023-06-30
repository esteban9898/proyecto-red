package com.example.proyectored.controllers;

import com.example.proyectored.models.ClienteMod;
import com.example.proyectored.models.PerfilMod;
import com.example.proyectored.services.ClienteServi;
import com.example.proyectored.services.PerfilServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/perfil")

public class PerfilControl {
    @Autowired
    private PerfilServi perfilServi;

    @GetMapping
    public ArrayList<PerfilMod> getPerfil(){
        return this.perfilServi.getPerfil();

    }
    @RequestMapping("/Crear")
    @PostMapping
    public PerfilMod  savePerfil(@RequestBody PerfilMod perfil){

        return this.perfilServi.savePerfil(perfil);

    }

    @GetMapping(path = "/{id}")
    public Optional<PerfilMod> geId(@PathVariable Long id){
        return this.perfilServi.getIdPerfil(id);

    }
    @PutMapping(path = "/Modificar/{id}")
    public PerfilMod updatePerfilContr(@RequestBody PerfilMod request, @PathVariable Long id){
        return this.perfilServi.updatePerfilContr(request, id);
    }

    @DeleteMapping(path ="/Eliminar/{id}")
    public String  DeletePerfil(@PathVariable  Long id){
        boolean ok= this.perfilServi.DeletePerfil(id);
        if(ok){
            return "Usuario " + id + "eliminado";
        }else {
            return "Error en la eliminacion";
        }
    }

}
