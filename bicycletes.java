public class BicycleTest {

	public static void main(String[] args) {
		Bicycle b1= new Bicycle();
		b1.setGear(60);
		b1.setSpeed(80);
		System.out.println(b1);
		
		Bicycle b2= new Bicycle(20,60);
		System.out.println(b2);
		
		MountainBike mb1= new MountainBike();
		System.out.println(mb1);
		
		
		
	}

}
