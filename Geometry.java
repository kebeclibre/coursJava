package coursJava;

public class Geometry {
	
	public void printRectangle(int size) {
		String ligne = "";
		for (int i = 0; i < size; i++) {
			ligne += "*";
		}
		for (int j = 0; j < size; j++) {
			System.out.println(ligne);
		}
	}

	public void printTriangle(int size) {
		for (int j = size ; j>0; j--){
			for (int i = 0 ; i < j; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}