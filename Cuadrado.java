package proceso;

public class Cuadrado {
	
	double diagonal(double lado) {
		double resultado;
		resultado = 1.4142 * lado; //La formula de pitagoras, si los catetos son iguales, se puede simplificar la formula a: Raiz de 2 por cateto
		return resultado;
	}
	double perimetro(double lado) {
		double resultado;
		resultado = lado * 4;
		return resultado;
	}
	double area(double lado) {
		double resultado;
		resultado = lado * lado;
		return resultado;
	}
}
