package pruebas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class PreviaPruebas {

	static Funciones funcion = null;
	static int pruebasRealizadas = 0;

	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Test");
		funcion = new Funciones();
	}

	@BeforeEach
	private void PruebaEjecutar() {
		pruebasRealizadas++;
		System.out.println("Ejecutando test " + pruebasRealizadas);
	}

	@AfterEach
	private void FinPrueba() {
		System.out.println("Fin test: " + pruebasRealizadas);
	}

	@AfterAll
	static void totalPruebas() {
		System.out.println("Se ha terminado de ejecutar todas las pruebas, se han realizado"
				+ pruebasRealizadas + "pruebas");
		funcion = null;
	}

}
