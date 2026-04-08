package Array;
public class ExemplosArrays {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "Chevrolet";
		System.out.println(cars[2]);
		//for indexado
		for (int i = 0; i < cars.length; i++) {
		    System.out.println(i + " -> " + cars[i]);
		}

		System.out.println("");
		int x = 0;
		while(x < cars.length) {
			System.out.println(x + " -> " + cars[x]);
			x++;
			
		}
		
		//não indexado - iterativo
		System.out.println("");
		for(String c : cars ) {
			System.out.println(c );
		}
		
	}
}