package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion1 extends PreviaPruebas {

	@Test
	@DisplayName("Prueba Caja negra valor limite Inferior")
	void prueba1() {
		assertEquals(true, Funciones.funcion1("El perro de San Roque no tiene rabo"));
	}

	@Test
	@DisplayName("Prueba Caja negra valor limite Inferior -1")
	// En esta prueba estan mis nombres y apellidos
	void prueba2() {
		assertEquals(false, Funciones.funcion1("Manuel Fernandez Gonzalez"));
	}

	@Test
	@DisplayName("Prueba Caja Negra particion Equivalente grupo positivo")
	void prueba3() {
		assertEquals(true, Funciones.funcion1("esternocleinomatoideo"));
	}

	@Test
	@DisplayName("Prueba Caja Negra particion Equivalente grupo negativo")
	void prueba4() {
		assertEquals(false, Funciones.funcion1("esternocleinomatoideo"));
	}

	@Test
	@DisplayName("Prueba de Test Caja Blanca Cobertura de Condiciones primera condicion correcta")
	/* Se cumple la condicion de cadena >=  */
	void prueba6() {
		assertEquals(true, Funciones.funcion1("se cumple la condicion: es mayor a 28"));
	}

	@Test
	@DisplayName("Prueba de Test Caja Blanca Cobertura de Condiciones primera condicion incorrecta")

	void prueba7() {
		assertEquals(false, Funciones.funcion1("la condicion no se cumpliria, es menor a 28"));
	}

	@Test
	@DisplayName("Tercera Prueba de Test Caja Blanca Cobertura de Caminos")
	void prueba8() {
		assertEquals(true,
				Funciones.funcion1("el primer camnino seria que la suma de las vocales de la cadena es > a 28"));
	}

	@Test
	@DisplayName("Cuarta Prueba de Test Caja Blanca Cobertura de Caminos 1")
	void prueba9() {
		assertEquals(false, Funciones.funcion1("el segundo camnino seria cadena < 28"));
	}

}
