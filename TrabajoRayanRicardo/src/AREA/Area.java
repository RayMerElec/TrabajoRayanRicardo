package AREA;
import java.util.Scanner;
public class Area {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double base = pedirBase();
		double altura = pedirAltura();
		double resultado = calcularArea(base, altura);
		
	}
	
	public static double pedirBase() {
		System.out.println("Introduzca una base:");
		double base = entrada.nextDouble();
		return base;
	}
	public static double pedirAltura() {
		System.out.println("Introduzca una altura:");
		double altura = entrada.nextDouble();
		return altura;
	}
	public static double calcularArea(double base, double altura) {
		double resultado = base*altura/2;
		System.out.println("El resultado es:");
		return resultado;
		
	}

}
