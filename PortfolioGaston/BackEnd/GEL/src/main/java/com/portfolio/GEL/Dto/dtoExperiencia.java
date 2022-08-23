package com.portfolio.GEL.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreEx;
    @NotBlank
    private String descripcionEx;
    
    //Constructor
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEx, String descripcionEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
    }
    
    //Getter and Setters

    public String getNombreEx() {
        return nombreEx;
    }

    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }
    
}
