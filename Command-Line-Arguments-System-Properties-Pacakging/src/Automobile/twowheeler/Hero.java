package Automobile.twowheeler;

import Automobile.Vehicle;

public class Hero extends Vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	@Override
	public String modelName() {
		return modelName;
	}

	@Override
	public String registrationNumber() {
		return registrationNumber;
	}

	@Override
	public String ownerName() {
		return ownerName;
	}

	public int speed() {
		return speed;
	}

	public void radio() {
		System.out.println("Accessing the radio");
	}

	public void displayHero() {
		System.out.println("ModelName:" + modelName + ", RegistrationNumber:" + registrationNumber + ", OwnerName:"
				+ ownerName + ", Speed:" + speed);
	}

}
