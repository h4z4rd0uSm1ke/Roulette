package ruleta;

import java.awt.Color;

/**
 * Clase que genera los colores y los pone en una matriz
 * 
 * @author Miguel Igual
 * @version 1.0
 */
public class Colors {
	
	//Se crean los colores y la matriz como atributos publicos
	public static Color verdeOscuro = new Color(5, 100, 2);
	public static Color verde = new Color(10, 205, 10);
	public static Color amarillo = new Color(255, 248, 14);
	public static Color naranja = new Color(255, 154, 0);
	public static Color marron = new Color(155, 88, 12);
	public static Color rojo = new Color(236, 16, 0);
	public static Color magenta = new Color(255, 0, 255);
	public static Color violeta = new Color(147, 0, 210);
	public static Color azul = new Color(0, 30, 236);
	public static Color cyan = new Color(150, 250, 250);
	public Color[] colores;
	
	/**
	 * El constructor de la clase.
	 * Crea la matriz de 10 colores y la rellena con los colores de la clase.
	 */
	public Colors(){
		colores = new Color[10];
		colores[0]=verdeOscuro;
		colores[1]=verde;
		colores[2]=amarillo;
		colores[3]=naranja;
		colores[4]=marron;
		colores[5]=rojo;
		colores[6]=magenta;
		colores[7]=violeta;
		colores[8]=azul;
		colores[9]=cyan;
	}
}
