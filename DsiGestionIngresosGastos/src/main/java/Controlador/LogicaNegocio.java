/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ingreso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivana
 */
public class LogicaNegocio {

    private static List<Ingreso> listaIngresos = new ArrayList<>();

    public static void anadirContacto(Ingreso ingreso) {
        listaIngresos.add(ingreso);
    }

    public static List<Ingreso> getListaContactos() {
        return listaIngresos;
    }
}
