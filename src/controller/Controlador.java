
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Modelo;
import model.vo.Respuesta1;
import view.Vista;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import model.vo.Respuesta2;
import model.vo.Respuesta3;

public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnInforme1.addActionListener(this);
        this.view.btnInforme2.addActionListener(this);
        this.view.btnInforme3.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Reto 5 Mision TIC!");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnInforme1){
            String[] titulo =new String[] {"ID_Lider","Nombre","Primer_Apellido","Ciudad_Residencia"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta1> Listado;
            try {
                Listado = model.con1();
                Listado.forEach(consulta -> {
                    view.mostrar.addRow(new Object[] {
                        consulta.getId_lider(),
                        consulta.getNombre(),
                        consulta.getPrimer_apellido(),
                        consulta.getCiudad_residencia()  
                    });
                });
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la consulta" + ex);
            }

        }
        
        
        if (e.getSource() == view.btnInforme2){
            String[] titulo =new String[] {"ID_Proyecto","Constructora","Numero_Habitaciones","Ciudad"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta2> Listado;
            try {
                Listado = model.con2();
                Listado.forEach(consulta -> {
                    view.mostrar.addRow(new Object[] {
                        consulta.getId_proyecto(),
                        consulta.getConstructora(),
                        consulta.getNumero_habitaciones(),
                        consulta.getCiudad()  
                    });
                });
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la consulta" + ex);
            }

        }
        
        if (e.getSource() == view.btnInforme3){
            String[] titulo =new String[] {"ID_Compra","Constructora","Banco_Vinculado"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta3> Listado;
            try {
                Listado = model.con3();
                Listado.forEach(consulta -> {
                    view.mostrar.addRow(new Object[] {
                        consulta.getId_compra(),
                        consulta.getConstructora(),
                        consulta.getBanco_vinculado() 
                    });
                });
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la consulta" + ex);
            }

        }
        
    }
   
}
