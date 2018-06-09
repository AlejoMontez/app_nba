package com.example.alejomontez.appnba.Stadiums.model;

public class Stadium {
    private Integer id;
    private String nombre;
    private String capacidad;
    private String anio;
    private String ciudad;
    private String url;

    public Stadium(Integer id, String nombre, String capacidad, String anio, String ciudad, String url) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.anio = anio;
        this.ciudad = ciudad;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
