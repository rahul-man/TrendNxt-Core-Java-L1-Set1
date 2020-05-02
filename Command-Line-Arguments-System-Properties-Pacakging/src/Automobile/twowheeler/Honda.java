package Automobile.twowheeler;

import Automobile.Vehicle;

public class Honda extends Vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int cdplayer;

	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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

	public int getSpeed() {
		return speed;
	}

	public int cdplayer(int command) {
		int p = command;
		switch (p) {
		case 1:
			System.out.println("Play");
			break;
		case 2:
			System.out.println("Pause");
			break;
		case 3:
			System.out.println("Next");
			break;
		case 4:
			System.out.println("Previous");
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
		return cdplayer;
	}

	public void displayHonda() {
		System.out.println("ModelName:" + modelName + ", RegistrationNumber:" + registrationNumber + ", OwnerName:"
				+ ownerName + ", Speed:" + speed);
	}
}
