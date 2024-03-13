package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Test validarFecha = new validarFechaTest();
	
	@CP2
	void test() {
		//resultado esperado, resultado obtenido
		assert equals(, "todos los meses");
	}
	
	@CP3
	void test() {
		assert equals(, "Febrero");
	}
	
	@CP4
	void test() {
		assert equals(, "Los meses de 30 días");
	}

	@CP5
	void test() {
		assert equals(, "Los meses de 31 días");
	}

}
