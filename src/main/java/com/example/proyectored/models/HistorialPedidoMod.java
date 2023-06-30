package com.example.proyectored.models;

import jakarta.persistence.*;

@Entity
@Table(name="HistorialPedido")
public class HistorialPedidoMod {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private int id_pedido;
    private int id_estado;
    private int fecha_hora;
    private String url_foto;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public int getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(int fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
}
