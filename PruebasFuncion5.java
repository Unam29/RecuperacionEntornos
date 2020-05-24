package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion5 extends PreparacionPruebas{

	@DisplayName("Prueba de Caja Negra: Numeros aleatorios")
	@Test
	void prueba1() {
		assertEquals(9, Funciones.funcion5("+",4,6));
	}
	@DisplayName("Prueba de Caja Negra: Valores vacios")
	@Test
	void prueba2() {
		assertEquals(0, Funciones.funcion5(" ", 0, 0));
	}
	@DisplayName("Tercera Prueba de Caja Negra con un caracter valido")
	@Test
	void prueba3() {
		assertEquals(25, Funciones.funcion5("*", 5, 5));
	}
	@DisplayName("Prueba de Caja Negra: Caracter invalido")
	@Test
	void prueba4() {
		assertEquals(0, Funciones.funcion5(";", 13, 0));
	}
	@DisplayName("Prueba de Caja Blanca: Cobertura de caminos 1")
	@Test
	void prueba5() {
		assertEquals(9, Funciones.funcion5("+", 6, 3));
	}
	@DisplayName("Prueba de Caja Blanca: Cobertura de caminos 2")
	@Test
	void prueba6() {
		assertEquals(6, Funciones.funcion5("-", 8, 2));
	}
	@DisplayName("Prueba de Caja Blanca: Cobertura de caminos 3")
	@Test
	void prueba7() {
		assertEquals(16, Funciones.funcion5("*", 6, 3));
	}
	@DisplayName("Prueba de Caja Blanca: Cobertura caminos: Ultimo Camino")
	@Test
	void prueba8() {
		assertEquals(0, Funciones.funcion5("a", 6, 3));
	}
	
}
