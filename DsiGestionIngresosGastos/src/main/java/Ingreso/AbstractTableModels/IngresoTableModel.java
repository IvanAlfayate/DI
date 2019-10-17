/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingreso.AbstractTableModels;

import Modelo.Ingreso;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ivana
 */
public class IngresoTableModel extends AbstractTableModel {

    private List<Ingreso> listaIngreso;
    private String[] cabeceras = {"Fecha", "Concepto", "Ingreso","Gastos"};

    public IngresoTableModel(List<Ingreso> listaIngreso) {
        this.listaIngreso = listaIngreso;

    }

    @Override
    public String getColumnName(int i) {
        return cabeceras[i];
    }

    @Override
    public int getRowCount() {
        return listaIngreso.size();
    }

    @Override
    public int getColumnCount() {
        return cabeceras.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaIngreso.get(rowIndex).getFecha();
            case 1:
                return listaIngreso.get(rowIndex).getConcepto();
            case 2:
                return listaIngreso.get(rowIndex).getImporte();

        }
        return null;
    }

    public void deleteRow(int row) {
        if (!(listaIngreso.size() == 0)) {
            listaIngreso.remove(row);         //borra la fila
            //fireTableRowsDeleted(row, row);    //Notifica a todos los listeners que las filas dentro del rango [firstRow, lastRow], inclusive, han sido eliminadas
            fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
        }
    }

    public void refrescar() {
        fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
    }
}
