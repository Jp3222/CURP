/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curp;

import com.jsql.conexion.Conexion;
import javax.swing.SwingUtilities;

/**
 *
 * @author jp
 */
public class CURP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estableciendo conexion con la base de datos
        Conexion cn = Conexion.getInstancia("jp", "12345", "jdbc:mysql://localhost/CURP");
        //Iniciando e mostrando Hilo de la interfaz del programa
        SwingUtilities.invokeLater(() -> new vista().setVisible(true));
    }

}
