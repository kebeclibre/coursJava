package coursJava;

public class MathTest {
	
	public boolean isPrime(int nb) {
		if (nb == 0 || nb == 1 || nb == 2 || nb == 3) {
			return true;
		} else {
			int numDivisor = 0;
			for (int i = 2; i < nb; i++) {
				if (nb % i == 0) {
					numDivisor++;
					if (numDivisor != 0) {
						return false;
					}
				}
			}
			return true;
		}
	}

	public void printRan() {
		long r = Math.round(10*Math.random());
		System.out.println(r);	
	}
}
