package proceso;

public class Main {
	public static void main(String[] args) {
		
		Cuadrado calculoCuad = new Cuadrado();
		Circulo calculoCirc = new Circulo();
		
		System.out.println("Diagonal del cuadrado: " + calculoCuad.diagonal(1822.38));
		System.out.println("Perimetro del cuadrado: " + calculoCuad.perimetro(1822.38));
		System.out.println("Area del cuadrado: " + calculoCuad.area(1822.38));
		System.out.println(" ");
		System.out.println("Perimetro del circulo: " + calculoCirc.circunferencia(1822.38));
		System.out.println("Area del circulo: " + calculoCirc.area(1822.38));
	}
}
