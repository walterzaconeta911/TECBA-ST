package com.TECBA.puntosdeinteres.demo;

public class Promocion {
    public String nombrePromocion;
    public String tipoDescuento;
    public Promocion(String nombrePromocion, String tipoDescuento) {
        this.nombrePromocion = nombrePromocion;
        this.tipoDescuento = tipoDescuento;
    }
    public String getNombrePromocion() {
        return nombrePromocion;
    }

    public void setNombrePromocion(String nombrePromocion) {
        this.nombrePromocion = nombrePromocion;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
}
