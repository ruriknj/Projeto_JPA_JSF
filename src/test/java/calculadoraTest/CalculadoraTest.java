package calculadoraTest;

import java.io.IOException;
import controle.CalculadoraBean;
import entidade.Usuario;

public class CalculadoraTest {

	public static void main(String[] args) throws IOException {

		CalculadoraBean cal = new CalculadoraBean();

		cal.setValor1(12);
		cal.setValor2(13);

		// cal.somar(); //-> metodo somar sem retorno (void) -> objeto;

		System.out.println("Resultado: " + cal.getResultado());

		// metodo com retorno (double)

		System.out.println("Resultado: " + cal.somar());

		Usuario cad = new Usuario();

		cad.setCpf("168018524-00");

		System.out.println("Cadastrados: " + cad.getCpf());

	}

}
