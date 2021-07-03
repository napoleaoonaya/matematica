package matematica;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void calculaSeASomaDeDoisNumerosEstaCorreta() {
		
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 10);
		
		Assert.assertEquals(20, soma);
		
	}

}
