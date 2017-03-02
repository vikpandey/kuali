package org.kuali.elevatorSystem;

/**
 * 
 * @author vikas
 *
 */

public class Elevator {

	private final int GROUND = 1;
	private int numberOfElevator;
	private int numberOfFloors;
	private int topFloor;
	private boolean occupied;
	private int floorNumber;
	private boolean doorOpen;
	private int numberOfTrips;
	private int numberOfFloorsPassed;
	private Elevator[] elevators;
	private boolean activeElevator;
	
	public boolean isActiveElevator() {
		return activeElevator;
	}

	public void setActiveElevator(boolean activeElevator) {
		this.activeElevator = activeElevator;
	}

	public Elevator(int numberOfElevator, int numberOfFloors) {
		this.numberOfElevator = numberOfElevator;
		this.numberOfFloors = numberOfFloors;
	}

	public int getNumberOfElevator() {
		return numberOfElevator;
	}

	public void setNumberOfElevator(int numberOfElevator) {
		this.numberOfElevator = numberOfElevator;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getTopFloor() {
		return topFloor;
	}

	public void setTopFloor(int topFloor) {
		this.topFloor = topFloor;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void setDoorOpen(boolean doorOpen) {
		this.doorOpen = doorOpen;
	}

	public int getNumberOfTrips() {
		return numberOfTrips;
	}

	public void setNumberOfTrips(int numberOfTrips) {
		this.numberOfTrips = numberOfTrips;
	}

	public int getNumberOfFloorsPassed() {
		return numberOfFloorsPassed;
	}

	public void setNumberOfFloorsPassed(int numberOfFloorsPassed) {
		this.numberOfFloorsPassed = numberOfFloorsPassed;
	}

	public int getGround() {
		return GROUND;
	}
	
	public Elevator[] getElevators() {
		return elevators;
	}
	
	public void setElvators(Elevator[] elevators) {
		this.elevators = elevators;
	}

}
