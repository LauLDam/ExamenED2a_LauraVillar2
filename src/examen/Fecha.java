package examen;


/**
 * Tenemos un programa para determinar según los datos que introduzcamos 
 * si puede ser una fecha válida que corresponda a algún mes real o no.
 *  
 * @author Laura Villar Caballero
 * 
 * @version 0.1
 * 
 **/
public class Fecha {
	
	/**
	 * Método para ver si una fecha es válida o no
	**/
	public static boolean fechaValida;
	
	
	/**
	 * Método con las variables para determinar si la fecha es correcta
	 * @param anio para introducir la cifra "año"
	 * @param mes para introducir la cifra "mes"
	 * @param dia para introducir la cifra "día"
	 * @return unos datos que forman una fecha correcta
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}
