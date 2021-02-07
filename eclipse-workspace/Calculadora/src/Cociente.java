/**
 * 	La clase Cociente contiene metodos para realizar operaciones de division en una calculadora.
 * 	
 * 	- Los metodos de la clase son todos estaticos, ya que no esta pensada para representar 
 * ningun objeto sino para acceder a un conjunto de funciones utiles para implementar una calculadora. 
 * 
 * @author Cristian Garcia Lagar
 * @since 22/01/2020
 * @version 1.0
 */
public class Cociente {
	
	/**
	 * El metodo devuelve el resultado de la division entre dos numeros reales. 
	 * Caso especial: Si el parametro numReal2 es igual a 0, se generara un mensaje de excepcion.
	 * 
	 * 
	 * @param numReal1 es el dividendo de la operacion matematica.
	 * @param numReal2 es el divisor de la operacion matematica.
	 * @return devuelve el resultado de una division.
	 */
	public static double division(double numReal1, double numReal2) {
		return numReal1/numReal2;
	}
	
	/**
	 * El metodo devuelve el resultado de la division entre dos numeros enteros.
	 * 
	 * El dato devuelto es double para que en caso de division inexacta devulva el resultado exacto.
	 * 
	 * Caso especial:Si el parametro numInt2 es igual a 0, se generara un mensaje de excepcion.
	 * 
	 * 
	 * @param numInt1 es el dividendo de la operacion matematica.
	 * @param numInt2 es el divisor de la operacion matematica.
	 * @return el resultado de la division.
	 */
	public static double division(int numInt1, int numInt2) {
		double division= (double) numInt1/numInt2;
		return division;
	}
	/**
	 * El metodo devuelve el inverso de un numero real.
	 *  
	 * @param numReal1 valor sobre el que se calculara el invero.
	 * @return el numero inverso.
	 */
	public static double inverso(double numReal1) {
		return 1/numReal1;
	}
	/**
	 * El metodo devuelve la raiz cuadrada del parametro.
	 * Caso especial:Si el parametro numInt1 es menor que 0, se generara un mensaje de excepcion.
	 * 
	 * @param numInt1 valor sobre el que se calculara la raiz cuadrada.
	 * @return la raiz cuadrada.
	 */
	public static double raizCuadrada(int numInt1) {
			return Math.sqrt(numInt1);
	}
}
