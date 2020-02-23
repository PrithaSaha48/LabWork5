public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v= new Vehicle("Dhk-1005k");
		System.out.println(v);
		Vehicle v1= new Vehicle("CTg-1402k");
		System.out.println(v1);
		
		
		Car c= new Car();
		c.setLicenseplate("CTG-4700");
		c.setNoofseat(8);
		System.out.println(c);
		
		

	}

}
