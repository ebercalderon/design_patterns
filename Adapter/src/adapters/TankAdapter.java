package adapters;

import contracts.Attacker;
import models.Tank;

public class TankAdapter implements Attacker {

	private final Tank tank;

	public TankAdapter(Tank tank) {
		this.tank = tank;
	}

//adapting methods
	@Override
	public void attack() {
		this.tank.fireWeapon();
	}

	@Override
	public void moveForward() {
		this.tank.driveForward();
	}

	@Override
	public void reactToHuman(String humanName) {
		this.tank.assignDriver(humanName);
	}
}
