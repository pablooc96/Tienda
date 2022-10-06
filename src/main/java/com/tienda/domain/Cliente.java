package com.tienda.domain;

import lombok.Data;

@Data
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
}
