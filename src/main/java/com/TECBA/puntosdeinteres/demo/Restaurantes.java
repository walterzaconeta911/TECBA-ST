package com.TECBA.puntosdeinteres.demo;
import java.util.ArrayList;
class Restaurantes
{
    public String dirrecion;
    public String nombre;
    public String lugar;
    public int precio;
    public boolean reserva;
    public ArrayList<Menu> menus;
    public Restaurantes(String dirrecion, String nombre, String lugar, int precio, boolean reserva,)
    {
        this.dirrecion = dirrecion;
        this.nombre = nombre;
        this.lugar = lugar;
        this.precio = precio;
        this.reserva = reserva;
        menus = new ArrayList<Menu>();
    }
    public void mostrarInformacion()
    {
        System.out.println("Informacion de "+nombre);
        System.out.println("Direccion: "+dirrecion);
        System.out.println("Lugar: "+lugar);
        System.out.println("Precio "+precio);
        System.out.println("Existe Reserva");
    }
    public void addMenu(Menu m)
    {
        menus.add(m);
    }
    public void mostrarMenu()
    {

    }
    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
}
