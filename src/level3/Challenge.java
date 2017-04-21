package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(1000);
	driveDirect(420,500);
	sleep(2000);
	driveDirect(500,395);
	sleep(100);
	driveDirect(500,500);
	}

	public void loop() {
	
	}
}
