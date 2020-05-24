package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion4 extends PreviaPruebas{

	@DisplayName("Prueba de Caja Negra: Lista valores nula")
	@Test
	void prueba1() {
		int[] notas = new int[1];
		notas[0] = 13;
		assertNull(null, Funciones.funcion4(notas));
	}
	@DisplayName("Prueba de Caja Negra: Lista de notas varios valores")
	@Test
	
	void prueba2() {
		int[] notas = new int[5];
		notas[0] = 5;
		notas[1] = 5;
		notas[2] = 5;
		notas[3] = 6;
		notas[4] = 4;
		assertEquals("suficiente", Funciones.funcion4(notas)); 
	}
	@DisplayName("Prueba de Caja Negra: Lista de notas con un valor")
	@Test
	void prueba3() {
		int[] notas = new int[1];
		notas[0] = 7; 
		assertEquals("notable", Funciones.funcion4(notas)); 
	}
	@DisplayName("Prueba de Caja Negra: Limite superior")
	@Test
	void prueba4() {
		int[] notas = new int[4];
		notas[0] = 3;
		notas[1] = 3;
		notas[2] = 3;
		notas[3] = 3;
		assertEquals("insuficiente", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Prueba de Caja Blanca: Cobertura Caminos 1")
	
	void prueba5() {
		int[] notas = new int[5];
		notas[0] = 1;
		notas[1] = 1;
		notas[2] = 2;
		notas[3] = 2;
		notas[4] = 4;
		assertEquals("insuficiente", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Tercera Prueba de Caja Blanca Cobertura Caminos 2")
	void prueba7() {
		int[] notas = new int[1];
		notas[0] = 6;
		assertEquals("bien", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Prueba de Caja Blanca: Cobertura Caminos 3")
	void prueba8() {
		int[] notas = new int[2];
		notas[0] = 7;
		notas[1] = 8;
		assertEquals("notable", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Quinta Prueba de Caja Blanca Cobertura Caminos 4")
	void prueba9() {
		int[] notas = new int[2];
		notas[0] = 9;
		notas[1] = 10;
		assertEquals("sobresaliente", Funciones.funcion4(notas)); 
	}
}
