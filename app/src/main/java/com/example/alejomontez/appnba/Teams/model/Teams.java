package com.example.alejomontez.appnba.Teams.model;

public class Teams {

    private int id;
    private  String nombre;
    private  String logo;
    private String entrenador;

    public Teams(int id, String nombre, String logo, String entrenador) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.entrenador = entrenador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
}
