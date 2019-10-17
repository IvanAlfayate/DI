/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ivana
 */
public class Ingreso {

    private Date fecha;
    private String concepto;
    private double importe;
    private double gastos;

    public Ingreso(Date fecha, String concepto, double importe) {
        this.fecha = fecha;
        this.concepto = concepto;
        if (importe < 0) {
            this.gastos = importe;
        } else {

            this.importe = importe;
        }

        this.gastos = gastos;

    }

    public Date getFecha() {
        return fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getImporte() {
        return importe;
    }

    public double getGastos() {
        return gastos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public String[] informacion() {

        String[] contacto = new String[3];
        contacto[0] = fecha.toString();
        contacto[1] = concepto;
        contacto[2] = String.valueOf(importe);
        return contacto;
    }

}
