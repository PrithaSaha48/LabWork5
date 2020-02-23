public Car() {
		super();
		
	}

	public Car(int noofseat) {
		super();
		this.noofseat = noofseat;
	}

	public Car(String licenseplate) {
		super(licenseplate);
		
	}

	public int getNoofseat() {
		return noofseat;
	}

	public void setNoofseat(int noofseat) {
		this.noofseat = noofseat;
	}

	@Override
	public String toString() {
		return "Car [noofseat=" + noofseat + "]";
	}
	
	

}
