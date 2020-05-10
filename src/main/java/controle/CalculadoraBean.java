package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "CalculadoraBean")
@ViewScoped
public class CalculadoraBean {

	private double valor1;
	private double valor2;
	private double subtracao;
	private double multiplicacao;
	private double divisao;
	private double resultado;

	public double somar() {

		return this.resultado = this.valor1 + this.valor2;

	}

	public void subtrair() {

		resultado = valor1 - valor2;

	}

	public void multiplicar() {

		resultado = valor1 * valor2;

	}

	public void dividir() {

		resultado = valor1 / valor2;

	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(double subtracao) {
		this.subtracao = subtracao;
	}

	public double getMultiplicacao() {
		return multiplicacao;
	}

	public void setMultiplicacao(double multiplicacao) {
		this.multiplicacao = multiplicacao;
	}

	public double getDivisao() {
		return divisao;
	}

	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}

}
