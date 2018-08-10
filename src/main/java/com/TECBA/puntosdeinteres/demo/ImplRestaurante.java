package com.TECBA.puntosdeinteres.demo;
import java.util.ArrayList;
public class ImplRestaurante {
    public static void main(String[] args) {
        ArrayList<Restaurantes> res = new ArrayList<Restaurantes>();
        //res.add();
        //res.add();
        //recorrer restaurantes
        for (int pos = 0; pos <= res.size(); pos++) {
            System.out.println(res.get(pos));
        }

    }

    public void eliminar(int pos) {
        for (int i = 0; i <= res.size(); i++) {
            if (i == pos) {
                res.remove(pos);
            }
        }
    }
    public String cambiar (String nom, int x)
    {
        for (int i = 0; i <= res.size(); i++) {
            if (i == x) {
                String nombre = res.getNombre(i);
            }
        }
        return nombre;
    }
}

