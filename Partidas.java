package org.example;

import java.util.List;

public class Partidas {
    private Integer numPartidas;
    private String descripcion;
    private List<Equipos> equipos;

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Partidas(Integer numPartidas, String descripcion) {
        this.numPartidas = numPartidas;
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumPartidas() {
        return numPartidas;
    }

    public void setNumPartidas(Integer numPartidas) {
        this.numPartidas = numPartidas;
    }
}
