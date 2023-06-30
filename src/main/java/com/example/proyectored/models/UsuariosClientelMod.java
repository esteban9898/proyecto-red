package com.example.proyectored.models;

import jakarta.persistence.*;

@Entity
@Table(name="usuarioscliente")
public class UsuariosClientelMod {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private int id_cliente;
    private int id_mensajero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_mensajero() {
        return id_mensajero;
    }

    public void setId_mensajero(int id_mensajero) {
        this.id_mensajero = id_mensajero;
    }
}
