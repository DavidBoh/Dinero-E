/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Christian
 */
public class ModeloBD {
    //ruta de la base de datos

    private String url = "jdbc:mysql://127.0.0.1:3306/dineroe";
    private String username = "DineroE";
    private String password = "secretpass";
    private Connection connect;
    
     public void conectar() {
        try {
            connect = DriverManager.getConnection(url, username, password);
            if (connect != null) {
                System.out.println("Conexión Exitosa");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error de Conexión\n");
        }
    }

    public void cerrar() {
        try {
            connect.close();
            System.out.println("Cerro Correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el SS1");
        }
    }

    public int guardaDatos(
            int tipoIdentificacion,
            String nombreUsuario,
            String apellidoUsuario,
            int identificacion,
            String correo,
            String contraseña) {
        int estado;
        try {
            String query = "call crearUsuario(?,?,?,?,?,?);";
            CallableStatement st = connect.prepareCall(query);
            st.setInt(1, tipoIdentificacion);
            st.setString(2, nombreUsuario);
            st.setString(3, apellidoUsuario);
            st.setInt(4, identificacion);
            st.setString(5, correo);
            st.setString(6, contraseña);
            st.execute();
            estado = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear usuario");
            estado = 0;
        }
        return estado;
    }

    public boolean ValidarU(int usuario, String contrasena) {
        boolean resultado = false;
        String campoDB;
        ResultSet result;

        try {
            campoDB = "call verificarUsuario(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            st.setString(2, contrasena);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getString(1).equals(String.valueOf(usuario)) && result.getString(2).equals(contrasena)) {
                    resultado = true;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }

    public int identificador(int usuario, String contrasena) {
        int resultado = 0;
        String campoDB;
        ResultSet result;

        try {
            campoDB = "call identificador(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            st.setString(2, contrasena);
            result = st.executeQuery();
            while (result.next()) {
                resultado = Integer.parseInt(result.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }

    public boolean confirmarU(int u) {
        boolean resultado = true;
        ResultSet result;
        try {
            CallableStatement st = connect.prepareCall("call consultarUsuario(?);");
            st.setInt(1, u);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getInt(1) > 0) {
                    resultado = false;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al confirmar Usuario en La BD");
        }
        return resultado;
    }

    public boolean confirmarCorreo(String correo) {
        boolean resultado = true;
        ResultSet result;
        try {
            CallableStatement st = connect.prepareCall("call consultarCorreo(?);");
            st.setString(1, correo);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getInt(1) > 0) {
                    resultado = false;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al confirmar Correo en La BD");
        }
        return resultado;
    }

    public Connection getConnect() {
        return connect;
    }

    public String consultarSaldo(int usuario) {
        String resultado = "0";
        String campoDB;
        ResultSet result;

        try {
            campoDB = "call consultarSaldo(?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            result = st.executeQuery();
            while (result.next()) {
                resultado = result.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }

    public ArrayList consultarHistorial(int usuario) {
        String campoDB;
        ResultSet result;
        ArrayList<String> datos = new ArrayList<>();        
        try {
            campoDB = "call consultarMovimientos(?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            result = st.executeQuery();
            while (result.next()) {               
                datos.add(result.getString(1));
                datos.add(result.getString(2));
                datos.add(result.getString(3));
                datos.add(result.getString(4));
                datos.add(result.getString(5));
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        } catch (Exception e) {
            System.err.println("Error de Validación en la BD, EBD2");
        }
        return datos;
    }

   
    public boolean ValidarContra(String contrasena) {
        boolean resultado = false;        
        String campoDB;
        ResultSet result;

        try {
            campoDB = "call verificarContrasena(?);";
            CallableStatement st = connect.prepareCall(campoDB);
            
            st.setString(1, contrasena);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getString(1).equals(contrasena)) {                    
                    resultado = true;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }

    public String actualizarSaldo(int usuario, int saldo) {
        String resultado = "0";
        String campoDB;
        ResultSet result;
        
        try{
            campoDB = "call actualizarSaldo(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);   
            st.setInt(2, saldo);
            result = st.executeQuery();
            while (result.next()) {                
                    resultado = result.getString(1);                
            }
            
        } catch (SQLException  ex){
            System.err.println("Error de Validación en la BD");
        }
        return resultado;       
    }
    
    public int identificadorCorreo(int usuario, String correo) {
        int resultado = 0;
        String campoDB;
        ResultSet result;

        try {
            campoDB = "call identificadorCorreo(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            st.setString(2, correo);
            result = st.executeQuery();
            while (result.next()) {
                resultado = Integer.parseInt(result.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }

    public boolean actualizarContrasena(int usuario, String nuevaContra) {
        boolean resultado = false;
        String campoDB;
        ResultSet result;
        try {
            campoDB = "call actualizarContrasena(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            st.setString(2, nuevaContra);
            result = st.executeQuery();            
            resultado = true;
        } catch (SQLException ex) {
            System.err.println("Error de Actualización de Contraseña");            
        }
        return resultado;
    }
    
}
