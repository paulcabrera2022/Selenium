package pe.visorweb.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	int sumar(int numeroUno, int numeroDos){
		   return numeroUno+numeroDos;
		}
		@Test
		void testSumar(){
		     int valorEsperado=15;
		     int valorObtenido= sumar(5,10);

		//Punto de verificacion
		Assertions.assertEquals(valorEsperado,valorObtenido);
		}
	
	
	
}
