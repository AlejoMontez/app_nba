package com.example.alejomontez.appnba.Match.model;

public class Calendar {

    public static final int TITLE_TYPE = 1;
    public static final int MATCH_TYPE = 0;

    private Integer tipo;
    private String dia;
    private String img_local;
    private String local;
    private String img_visitante;
    private String visitante;
    private String hora;

    public static int getTitleType() {
        return TITLE_TYPE;
    }

    public static int getMatchType() {
        return MATCH_TYPE;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getImg_local() {
        return img_local;
    }

    public void setImg_local(String img_local) {
        this.img_local = img_local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getImg_visitante() {
        return img_visitante;
    }

    public void setImg_visitante(String img_visitante) {
        this.img_visitante = img_visitante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
