package com.bicycle;

public class Bicycle {

	public boolean state;
	public int currentSpeed;

	public Bicycle() {
		this.currentSpeed = 0;
		this.state = false;
	}

	public Bicycle(int currentSpeed) {
		if (currentSpeed > 0) {
			this.currentSpeed = currentSpeed;
			this.state = true;
		} else if (currentSpeed <= 0) {
			this.currentSpeed = 0;
			this.state = false;
		}
	}

	public void increseSpeed() {

		currentSpeed++;
         state=true;
	}

	public void decreseSpeed() {

		if (isMoving()) {
			currentSpeed--;
		} 
		if(currentSpeed==0)
			state = false;
		}

	

	public void setState(boolean state) {
		this.state = state;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public boolean isMoving() {

		return state;
	}
}
