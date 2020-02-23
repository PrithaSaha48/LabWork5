public class MountainBike extends Bicycle {
	public int seatheight;

	public MountainBike() {
		super();
		
	}

	public MountainBike(int gear, int speed,int seatheight) {
		super(gear, speed);
		
	}

	public int getSeatheight() {
		return seatheight;
	}

	public void setSeatheight(int seatheight) {
		this.seatheight = seatheight;
	}

	@Override
	public String toString() {
		return "MountainBike [seatheight=" + seatheight + ", gear=" + gear +", speed=" + speed +"]";
	}
	
	

}