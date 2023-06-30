package com.example.proyectored.controllers;

import com.example.proyectored.models.UsuarioMod;
import com.example.proyectored.models.UsuariosClientelMod;
import com.example.proyectored.services.UsuarioClienteServi;
import com.example.proyectored.services.UsuarioServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarioCliente")

public class UsusarioCliienteControl {
    @Autowired
    private UsuarioClienteServi usuarioServi;

    @GetMapping
    public ArrayList<UsuariosClientelMod> getUsuarios(){
        return this.usuarioServi.getUsuario();

    }
    @RequestMapping("/Crear")
    @PostMapping
    public UsuariosClientelMod  saveUsuario(@RequestBody UsuariosClientelMod usuario){

        return this.usuarioServi.saveUSuario(usuario);

    }

    @GetMapping(path = "/{id}")
    public Optional<UsuariosClientelMod> geId(@PathVariable Long id){
        return this.usuarioServi.getId(id);

    }
    @PutMapping(path = "/Modificar/{id}")
    public UsuariosClientelMod updateUsuarioContr(@RequestBody UsuariosClientelMod request, @PathVariable Long id){
        return this.usuarioServi.updateUsuarioContr(request, id);
    }

    @DeleteMapping(path ="/Eliminar/{id}")
    public String  DeleteUsuario(@PathVariable  Long id){
        boolean ok= this.usuarioServi.DeleteUSuario(id);
        if(ok){
            return "Usuario " + id + "eliminado";
        }else {
            return "Error en la eliminacion";
        }
    }

}
