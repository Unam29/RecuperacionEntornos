package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion2 extends PreviaPruebas {

	@Test
	@DisplayName("Prueba de Caja Negra: Cadenas Vacias")
	void prueba1() {
		assertEquals(null, Funciones.funcion2("", ""));
	}

	@Test
	@DisplayName("Prueba de Caja Negra: Cadenas Aleatorias")
	void prueba2() {
		assertEquals(true, Funciones.funcion2("me encanta las cevezas por la tarde", "me encantan los toros"));
	}

	@Test
	@DisplayName("Prueba de Caja Negra: particion Equivalente grupo positivo")
	void prueba3() {
		assertEquals(true, Funciones.funcion2("espernocleidomastoideo", "barrio"));
	}

	@Test
	@DisplayName("Prueba de Caja Negra: particion Equivalente grupo negativo")
	void prueba4() {
		assertEquals(false, Funciones.funcion2("superheroe", "supervillano"));
	}

	@Test
	@DisplayName("Prueba de Caja Blanca: Cobertura Decisiones Primera Decision")
	
	void prueba5() {
		assertEquals(true, Funciones.funcion2("esternocleidomastoideo", "viva el betis"));
	}

	@Test
	@DisplayName("Prueba de Caja Blanca: Cobertura Decisiones Primera Decision")
	
	void prueba6() {
		assertEquals(false, Funciones.funcion2("puntillitas", "Entrecot y lenguado"));
	}

	@Test
	@DisplayName("Tercera Prueba de Caja Blanca Cobertura Caminos Primer Camino")
	// prueba realizada con mi nombre y mi primer apellido
	void prueba7() {
		assertEquals(true, Funciones.funcion2("manuel", "fernandez"));
	}

	@Test
	@DisplayName("Cuarta Prueba de Caja Blanca Cobertura Caminos Segundo Camino")
	// prueba realizada con mis dos apellidos
	void prueba8() {
		assertEquals(false, Funciones.funcion2("fernandez", "gonzalez"));
	}
