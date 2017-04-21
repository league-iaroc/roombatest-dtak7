package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(1500);
		driveDirect(400,500);
		sleep(1700);
		driveDirect(450,500);
		sleep(3500);
		driveDirect(500,385);
	}

	public void loop() {
	
	}
}
