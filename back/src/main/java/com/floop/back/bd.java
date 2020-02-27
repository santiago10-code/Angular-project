package com.floop.back;

import javax.persistence.*;

@Entity
@Table(name = "bd")
public class bd {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String obaservacion;
    @Column
    private String texto;

    public void setId(int id) {
        this.id = id;
    }

    public void setObaservacion(String obaservacion) {
        this.obaservacion = obaservacion;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public String getObaservacion() {
        return obaservacion;
    }

    public String getTexto() {
        return texto;
    }
    
}
