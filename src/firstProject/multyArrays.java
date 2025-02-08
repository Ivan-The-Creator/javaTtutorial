package firstProject;

	public class multyArrays {
		
		public static void main (String[] args) {
			
			String[][] cars = new String[3][3];
			
			cars[0][0] = "Camaro";
			cars[0][1] = "Pontiak";
			cars[0][2] = "Mazda";
			cars[1][0] = "Tesla";
			cars[1][1] = "Mersedes";
			cars[1][2] = "BMW";
			cars[2][0] = "Kia";
			cars[2][1] = "Ford";
			cars[2][2] = "Volkswagen";
			
			for (int i=0; i<cars.length; i++) {
				System.out.println();
				for (int j=0; j<cars[i].length; j++) {
					System.out.print(cars[i][j]+", ");
				}
			}
			
			System.out.println("");
			
			//an additional way to assign an array
			String[][] carsSec = {
									{"Camaro","Pontiak","Mazda"},
								  	{"Tesla","Mersedes","BMW"},
								  	{"Kia","Ford","Volkswagen"}
								  };
			
			for (int i=0; i<carsSec.length; i++) {
				System.out.println();
				for (int j=0; j<carsSec[i].length; j++) {
					System.out.print(carsSec[i][j]+", ");
				}
			}
			
			
		}
		
	}