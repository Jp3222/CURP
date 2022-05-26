/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curp;

/**
 *
 * @author jp
 */
public class Validar {

    /**
     * Constamte que guarda las vocales
     */
    private final char[] VOCALES;
    /**
     * Constamte que guarda las consonantes
     */
    private final char[] CONSONANTES;
    /**
     * Constante que guarda el nombre de los estados
     */
    private final String[] ESTADOS;

    public Validar() {
        this.VOCALES = new char[]{
            'A', 'E', 'I', 'O', 'U'
        };
        this.CONSONANTES = new char[]{
            'B', 'C', 'D', 'F', 'G',
            'H', 'J', 'K', 'L', 'M',
            'N', 'Ñ', 'P', 'Q', 'R',
            'S', 'T', 'V', 'X', 'Z',
            'W', 'Y'};
        this.ESTADOS = new String[]{
            "Aguascalientes-AS",
            "Baja California-BC",
            "Baja California Sur-BS",
            "Campeche-CC",
            "Chiapas-CS",
            "Chihuahua-CH",
            "Ciudad de México-DF",
            "Coahuila-CL",
            "Colima-CM",
            "Durango-DG",
            "Guanajuato-GT",
            "Guerrero-GR",
            "Hidalgo-HG",
            "Jalisco-JC",
            "México-MC",
            "Michoacán-MN",
            "Morelos-MS",
            "Nayarit-NT",
            "Nuevo León-NL",
            "Oaxaca-OC",
            "Puebla-PL",
            "Querétaro-QO",
            "Quintana Roo-QR",
            "San Luis Potosí-SP",
            "Sinaloa-SL",
            "Sonora-SR",
            "Tabasco-TC",
            "Tamaulipas-TS",
            "Tlaxcala-TL",
            "Veracruz-VZ",
            "Yucatán-YN",
            "Zacatecas-ZS"
        };
    }

    /**
     * Metodo para saber si un caracter es una vocal
     *
     * @param c caracter a evaluar
     * @return true si es una vocal
     */
    public boolean isVocal(char c) {
        for (char v : VOCALES) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }

    /**
     * *
     * Metodo para saber si un caractaer es una consonante
     *
     * @param c caracter a evaluar
     * @return true si es una consonante
     */
    public boolean isConsonante(char c) {
        for (char v : CONSONANTES) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }

    /**
     * *
     * Metodo para obtener primer consonante de una cadena
     *
     * @param c cadena de la cual se va a extraer la consonante
     * @return la primer consonante encontrada o '-' si no se encontro ninguna
     */
    public char getConsonante(String c) {
        for (int i = 0; i < c.length(); i++) {
            char aux = c.charAt(i);
            if (isConsonante(aux)) {
                return aux;
            }
        }
        return '-';
    }

    /**
     * *
     * Metodo para obtener primer vocal de una cadena
     *
     * @param c cadena de la cual se va a extraer la vocal
     * @return la primer vocal encontrada o '-' si no se encontro ninguna
     */
    public char getVocal(String c) {
        for (int i = 0; i < c.length(); i++) {
            char aux = c.charAt(i);
            if (isVocal(aux)) {
                return aux;
            }
        }
        return '-';
    }

    /**
     * Metodo que establece el formato del nombre completo
     *
     * @param nombre
     * @param ap
     * @param am
     * @return los primeros 4 caracteres de la curp
     */
    public String getNombreFormato(String nombre, String ap, String am) {
        String formato = "";
        formato += "" + ap.charAt(0);
        for (int i = 0; i < ap.length(); i++) {
            char c = ap.charAt(i);
            if (isVocal(c)) {
                formato += "" + c;
                break;
            }
        }
        formato += "" + am.charAt(0);
        formato += "" + nombre.charAt(0);
        return formato;
    }

    /**
     * Metodo que establece formato segun la fecha enviada
     *
     * @param dia
     * @param mes
     * @param anio
     * @return la fecha de nacimiento con el formato para establecerce en la
     * curp
     */
    public String getFechaFormato(String dia, String mes, String anio) {
        String formato = anio.charAt(anio.length() - 2) + "" + anio.charAt(anio.length() - 1);
        formato += mes + dia;
        return formato;
    }

    /**
     * Metodo que busca segun el estado retorna las iniciales del mismo
     *
     * @param e variable que indica el estado
     * @return el 'estado' buscando o 'null' si no existe en la lista
     */
    public String getEstadoFormato(String e) {
        for (String string : ESTADOS) {
            String[] aux = string.split("-");
            if (e.equalsIgnoreCase(aux[0])) {
                return aux[1];
            }
        }
        return null;
    }
}
