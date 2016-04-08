package coursJava;

public class Main {

	public static void main(String[] args) {

		MathTest mathTest = new MathTest();
		Geometry geo = new Geometry();
		
		for (String recup : args) {
			int nombre = Integer.parseInt(recup);
			System.out.println(mathTest.isPrime(nombre));
			geo.printRectangle(nombre);
			geo.printTriangle(nombre);
			
		mathTest.printRan();
		}
	}
}