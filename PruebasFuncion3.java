package pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion3 extends PreparacionPruebas {

	@DisplayName("Prueba de Caja Negra: Lista de numeros vacia")
	@Test
	void prueba1() {
		int[] num = new int[0];
		assertEquals(0, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Negra: imite superior")
	@Test
	void Prueba2() {
		int[] num = new int[1];
		num[0] = 28;
		assertEquals(28, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Negra: Limite inferior")
	@Test
	void prueba3() {
		int[] num = new int[1];
		num[0] = 14;
		assertEquals(14, Funciones.funcion3(num));
	}

	@DisplayName("Cuarta Prueba de Caja Negra: Valor fuera del rango")
	@Test
	void prueba4() {
		int[] num = new int[4];
		num[0] = 7;
		num[1] = 22;
		num[2] = 16;
		num[3] = 15;
		assertEquals(60, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Blanca: Cobertura de sentencias")
	@Test
	
	void prueba5() {
		int[] num = new int[4];
		num[0] = 22;
		num[1] = 15;
		num[2] = 17;
		num[3] = 26;
		assertEquals(80, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Blanca: Cobertura de Caminos ")
	@Test
	
	void prueba6() {
		int[] num = new int[4];
		num[0] = 22;
		num[1] = 30;
		num[2] = 21;
		num[3] = 24;
		assertEquals(22, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Blanca: Cobertura de Caminos 2 ")
	@Test

	void prueba7() {
		int[] num = new int[4];
		num[0] =17;
		num[1] = 23;
		num[2] = 12;
		num[3] = 7;
		assertEquals(40, Funciones.funcion3(num));
	}

	@DisplayName("Prueba de Caja Blanca: Cobertura de Caminos 3 ")
	@Test
	void prueba8() {
		int[] num = new int[4];
		num[0] = 0;
		num[1] = 20;
		num[2] = 24;
		num[3] = 18;
		assertEquals(0, Funciones.funcion3(num));
	}

}
